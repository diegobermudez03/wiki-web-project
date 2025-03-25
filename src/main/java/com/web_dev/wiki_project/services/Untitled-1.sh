#!/bin/bash
REGION=us-east1
ZONE=us-east1-c
FIREWALL=allow-tcp-rule-655

gcloud config set compute/zone $ZONE
gcloud config set compute/region $REGION


gcloud compute instance-templates create lb-backend-template \
   --region=$REGION \
   --network=default \
   --subnet=default \
   --tags=allow-health-check \
   --machine-type=e2-medium \
   --image-family=debian-11 \
   --image-project=debian-cloud \
   --metadata=startup-script='#!/bin/bash
    apt-get update
    apt-get install -y nginx
    service nginx start
    sed -i "s/nginx/Google Cloud Platform - $(hostname)/" /var/www/html/index.nginx-debian.html'


gcloud compute instance-groups managed create lb-backend-group \
    --template=lb-backend-template \
    --size=2 \
    --zone=$ZONE


gcloud compute firewall-rules create $FIREWALL \
  --network=default \
  --action=allow \
  --direction=ingress \
  --source-ranges=130.211.0.0/22,35.191.0.0/16 \
  --target-tags=allow-health-check \
  --rules=tcp:80


gcloud compute firewall-rules create $FIREWALL \
  --network=default \
  --action=allow \
  --direction=ingress \
  --source-ranges=0.0.0.0/0 \
  --rules=tcp:80

gcloud compute health-checks create http http-check --port 80

gcloud compute backend-services create web-backend-service \
	--protocol=HTTP \
	--port-name=http \
	--health-checks=http-basic-check \
	--global


gcloud compute backend-services create nginx-backend-service \
	--protocol=HTTP \
	--port-name=http \
	--health-checks=http-check \
    --global

gcloud compute backend-services add-backend web-backend-service \
	--instance-group=lb-backend-group \
	--instance-group-zone=us-east1-c \
	--global


gcloud compute backend-services add-backend nginx-backend-service \
	--instance-group=nginx-backend-group \
	--instance-group-zone=$ZONE \
	--global


gcloud compute url-maps create nginx-map-http --default-service nginx-backend-service

gcloud compute target-http-proxies create http-proxy --url-map nginx-map-http


gcloud compute addresses create proxy-ip --ip-version=IPV4 --global


gcloud compute forwarding-rules create http-content-rule \
	--address=proxy-ip \
	--global \
	--target-http-proxy=http-proxy \
	--ports=80

gcloud compute forwarding-rules create http-content-rule \
	--address=lb-ipv4-1 \
	--global \
	--target-http-proxy=http-lb-proxy \
	--ports=80
