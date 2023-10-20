package com.example.contactmicro.services;

import com.example.contactmicro.entity.Contact;
import com.example.contactmicro.repo.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class ContactService {

    @Autowired
    private ContactRepo contactRepo;

    @Async(value = "asyncExecutor")
    public CompletableFuture<Contact> saveContact(Contact contact){
            contactRepo.save(contact);
            return CompletableFuture.completedFuture(contact);
    }


}
