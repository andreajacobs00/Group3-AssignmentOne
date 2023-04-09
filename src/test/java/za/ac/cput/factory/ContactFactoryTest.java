// Aquilla Williams
// 217284205
//ADP3 Assignment1
package za.ac.cput.factory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import za.ac.cput.domain.Contact;

import static org.junit.jupiter.api.Assertions.*;

class ContactFactoryTest {

    void createContact(){
    Contact contact = ContactFactory.createContact("0792515446","001","217284505@mycput.ac.za","0814525412");
    assertNotNull(contact);
    System.out.println(contact.toString());

}

}