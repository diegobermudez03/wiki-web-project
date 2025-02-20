package com.web_dev.wiki_project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.web_dev.wiki_project.entities.EndpointEntity;
import com.web_dev.wiki_project.repos.EndpointsRepository;

@Component
public class EndpointsService {
    @Autowired
    private EndpointsRepository repo;

    public List<EndpointEntity> getEndpoints(){
        return repo.findAll();
    }
}
