package com.example.ContactMicroserviceExceptionHandling.Service;



import com.example.ContactMicroserviceExceptionHandling.Model.Contact;

import java.util.List;

public interface IContactService {
    void addContact(Contact contact) throws Exception;
    Contact showContact(String email);
    void deleteContact(String email);
    List<Contact> findAll();
    void deleteContact(int id);
    Contact showContact(int id);
    void updateContact(Contact contact);
}
