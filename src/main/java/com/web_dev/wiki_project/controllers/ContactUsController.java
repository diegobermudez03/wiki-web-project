package com.web_dev.wiki_project.controllers;

import com.web_dev.wiki_project.dtos.ContactUsDTO;
import com.web_dev.wiki_project.services.ContactUsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactUsController {

    @Autowired
    private ContactUsService service;
    
    @PostMapping
    public ResponseEntity<String> submitContactForm(@RequestBody ContactUsDTO contactDTO) {
        try {
            service.storeContactInfo(
                contactDTO.getFirstName(), 
                contactDTO.getLastName(), 
                contactDTO.getEmail(), 
                contactDTO.getDescription(), 
                contactDTO.getSemester());
            return ResponseEntity.status(HttpStatus.OK).body(null);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }
}
