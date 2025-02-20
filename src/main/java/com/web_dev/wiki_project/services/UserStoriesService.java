package com.web_dev.wiki_project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.web_dev.wiki_project.entities.UserStoryEntity;
import com.web_dev.wiki_project.repos.UserStoriesRepository;

@Component
public class UserStoriesService {

    @Autowired
    private UserStoriesRepository repo;
    
    public List<UserStoryEntity> getArrendStories(){
        return repo.findAllByType("ARRENDADOR");
    }

    public List<UserStoryEntity> getAdminStories(){
        return repo.findAllByType("ADMINISTRADOR");
    }
    
}
