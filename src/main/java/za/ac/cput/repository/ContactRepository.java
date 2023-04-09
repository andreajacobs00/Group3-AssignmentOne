package za.ac.cput.repository;

import za.ac.cput.domain.Contact;

import java.util.HashSet;
import java.util.Set;

public class ContactRepository implements IContactRepository{

    private static ContactRepository respository = null;

    // this is to add objects in my set
    private Set<Contact> contactDB = null;

    private ContactRepository() { contactDB = new HashSet<Contact>();
    }
    // my signaltin methods to sort data
    public static ContactRepository getRespository(){

        if (respository == null){
            respository = new ContactRepository();

        }
        return respository;
    }

    //  create part where a object value of contact using add
    @Override
    public Contact create(Contact contact){
        boolean success = contactDB.add(contact);
        if (!success)
            return null;
        return contact;
    }
    // where i read i need to use the primary key
    // passing a the primary key returning an objects
    @Override
    public Contact read(String  custID){
        Contact contact = contactDB.stream()
                .filter(e-> e.getCustID().equals(custID))
                .findAny()
                .orElse(null);
        return contact;

    }
    //passing through objects to get old values and remove then amd then update it
    @Override
    public Contact update (Contact contact) {
        Contact oldContact = read(contact.getCustID());
        if (oldContact != null) {
            contactDB.remove(oldContact);
            contactDB.add(contact);
            return contact;
        } else {
            contactDB.add(contact);
            return contact;
        }

    }


    @Override
    public boolean delete(String custID){
        Contact contactToDelete = read(custID);
        if(contactToDelete == null)
            return false;
        contactDB.remove(contactToDelete);
        return true;

    }
    @Override
    public Set<Contact> getAll(){
        return contactDB;
    }
}
