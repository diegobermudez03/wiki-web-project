package com.web_dev.wiki_project.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.web_dev.wiki_project.entities.EndpointEntity;

@Component
public class EndpointsService {

    public List<EndpointEntity> getEndpoints(){
        List<EndpointEntity> endpoints = new ArrayList<>();
        endpoints.add(new EndpointEntity(1L, "/api/v1/auth/acounts", "POST", "Crea cuenta de ADMIN o ARRENDADOR, el rol esta definido en el payload", "LANDLORD/USER", false));
        endpoints.add(new EndpointEntity(2L, "/api/v1/auth/acounts/activate", "POST", "Confirma la creacion de la cuenta con el token recibido por correo", "LANDLORD/USER", false));
        endpoints.add(new EndpointEntity(3L, "/api/v1/auth/sessions", "POST", "crea una nueva sesion para la cuenta, es un login", "LANDLORD/USER", false));
        endpoints.add(new EndpointEntity(4L, "/api/v1/auth/refresh", "POST", "Obtiene un nuevo access token para la sesion", "LANDLORD/USER", true));
        endpoints.add(new EndpointEntity(5L, "/api/v1/properties/departments", "GET", "Obtiene los departamentos disponibles permitidos", "LANDLORD/USER", true));
        endpoints.add(new EndpointEntity(6L, "/api/v1/properties/{finca_id}/pictures", "POST", "Publica una nueva foto a la finca en cuestion", "LANDLORD", true));
        endpoints.add(new EndpointEntity(7L, "/api/v1/files/properties", "POST", "Publica una nueva finca", "LANDLORD", true));
        endpoints.add(new EndpointEntity(8L, "/api/v1/files/properties/{property_id}", "GET", "Obtiene la finca completa", "LANDLORD/USER", true));
        endpoints.add(new EndpointEntity(9L, "/api/v1/properties/{property_id}", "PUT", "Actualiza la informacion de la finca del landlord", "LANDLORD", true));
        endpoints.add(new EndpointEntity(10L, "/api/v1/properties/{property_id}", "DELETE", "Elimina la finca del landlord registrado", "LANDLORD", true));
        endpoints.add(new EndpointEntity(11L, "/api/v1/properties?page=1&name=string&department=string&nRooms=1&nPeople=1&minPrice=1&maxPrice=1", "GET", "Obtiene las fincas con base a los filtros establecidos", "LANDLORD/USER", true));
        endpoints.add(new EndpointEntity(12L, "/api/v1/properties/mine?page=1", "GET", "Obtiene las fincas del landlord registrado", "LANDLORD", true));
        endpoints.add(new EndpointEntity(13L, "/api/v1/rental/properties/{property_id}/requests", "POST", "Envia una nueva request de estadia en la finca", "USER", true));
        endpoints.add(new EndpointEntity(14L, "/api/v1/rental/properties/{property_id}/schedules?month=7&year=2024", "POST", "Retorna las programaciones de la finca para no colisionar", "USER", true));
        endpoints.add(new EndpointEntity(15L, "/api/v1/rental/requests?page=1", "GET", "Retorna las requests realizadas por el usuario", "USER", true));
        endpoints.add(new EndpointEntity(16L, "/api/v1/rental/owner/requests?page=1", "GET", "Retorna las requests asociadas a las fincas del landlord", "LANDLORD", true));
        endpoints.add(new EndpointEntity(17L, "/api/v1/rental/{rental_request_id}/accept", "PATCH", "Acepta una solicitud de arrendacion", "LANDLORD", true));
        endpoints.add(new EndpointEntity(18L, "/api/v1/rental/{rental_request_id}/deny", "PATCH", "Rechaza una solicitud de arrendacion", "LANDLORD", true));
        endpoints.add(new EndpointEntity(19L, "/api/v1/rental/requests/{request_id}/ratings", "POST", "Agrega el rating respecto a un request, si es LANDLORD es al user, si es USER es al LANDLORD y la finca", "LANDLORD/USER", true));
        endpoints.add(new EndpointEntity(20L, "/api/v1/payments/banks", "GET", "Obtiene todos los bancos validos para pago", "USER", true));
        endpoints.add(new EndpointEntity(21L, "/api/v1/payments/requests/{request_id}/payments", "POST", "Realiza un pago asociado a una reserva", "USER", true));
        endpoints.add(new EndpointEntity(22L, "/api/v1/files/properties/{finca_id}/{img_name}", "GET", "Obtiene la foto de la finca", "USER/LANDLORD", false));

        return endpoints;
    }
}
