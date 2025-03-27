package com.web_dev.wiki_project.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class EndpointEntity {
    private Long id;
    private String route;
    private String method;
    private String description;
    private String role;
    private boolean auth;
    public EndpointEntity(){}
}
