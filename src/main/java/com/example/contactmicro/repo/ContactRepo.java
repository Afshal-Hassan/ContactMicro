package com.example.contactmicro.repo;

import com.example.contactmicro.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepo  extends JpaRepository<Contact,Integer> {
}
