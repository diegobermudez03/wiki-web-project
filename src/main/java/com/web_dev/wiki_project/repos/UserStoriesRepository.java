package com.web_dev.wiki_project.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web_dev.wiki_project.entities.UserStoryEntity;

public interface UserStoriesRepository extends JpaRepository<UserStoryEntity, Long>{
    List<UserStoryEntity> findAllByType(String type);
}
