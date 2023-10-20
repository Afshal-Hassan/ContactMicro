package com.example.contactmicro.controller;

import com.example.contactmicro.entity.Contact;
import com.example.contactmicro.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/contact")
public class ContactController {


    @Autowired
    private ContactService contactService;

    @PostMapping("/save")

    public CompletableFuture<ResponseEntity> saveContact(@RequestBody Contact contact){
        return contactService.saveContact(contact).thenApply(ResponseEntity::ok);
    }

    @GetMapping("/test")
    public String test(){
        return "Hello from Spring";
    }

}
