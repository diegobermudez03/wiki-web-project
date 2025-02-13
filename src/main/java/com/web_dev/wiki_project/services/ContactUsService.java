package com.web_dev.wiki_project.services;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.web_dev.wiki_project.entities.ContactUsEntity;
import com.web_dev.wiki_project.repos.ContactUsRepository;
import jakarta.el.ELException;

@Component
public class ContactUsService {

    @Autowired
    private ContactUsRepository repo;

    public void storeContactInfo(String firstName, String lastName, String email, String description, int semester) throws Exception{
        if(firstName.isEmpty() || lastName.isEmpty() || description.isEmpty() || email.isEmpty()){
            throw new Exception("Debes llenar todos los campos");
        }
        if(semester < 0 || semester > 16){
            throw new Exception("El semestre debe estar entre 0 y 16");
        }
        if(!Arrays.stream(email.split("")).allMatch((el)->el.toUpperCase().equals(el))){
            throw new Exception("Correo debe estar en mayusculas");
        }
        var parts = email.split("@");
        if(parts.length != 2){
            throw new Exception("Correo no contiene @");
        }
        if(!parts[1].contains(".")){
            throw new ELException("Correo invalido");
        }
        repo.save(ContactUsEntity.builder()
        .firstName(firstName)
        .lastName(lastName)
        .email(email)
        .description(description)
        .semester(semester).build()
        );
    }
    
}
