package za.ac.cput.repository;

import za.ac.cput.domain.Contact;

import java.util.Set;

public interface IContactRepository extends IRepository<Contact, String>{

    public Set<Contact> getAll();

}
