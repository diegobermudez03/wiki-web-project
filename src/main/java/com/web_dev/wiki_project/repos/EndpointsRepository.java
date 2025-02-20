package com.web_dev.wiki_project.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web_dev.wiki_project.entities.EndpointEntity;

public interface EndpointsRepository extends JpaRepository<EndpointEntity, Long>{
    
}
