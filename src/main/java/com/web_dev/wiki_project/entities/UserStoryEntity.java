package com.web_dev.wiki_project.entities;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserStoryEntity {
    private Long id;
    private String storyId;
    private String name;
    private String sentence;
    private String criteria;
    private String type;

    public UserStoryEntity(){}
}
