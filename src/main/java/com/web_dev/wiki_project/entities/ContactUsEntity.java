package com.web_dev.wiki_project.entities;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;




@Builder
@Getter
@Setter
public class ContactUsEntity {
    private Long id;
	private String firstName;
	private String lastName;
    private String description;
	private String email;
    private int semester;

}
