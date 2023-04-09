// Aquilla Williams
// 217284205
//ADP3 Assignment1
package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Contact;
import za.ac.cput.factory.ContactFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class ContactRepositoryTest {

    private static ContactRepository repository = ContactRepository.getRespository();
    private static Contact contact = ContactFactory.createContact("0789547842","0025","217284205@mycput.ac.za","0792515446");


    @Test
    void a_create() {

        Contact  created = repository.create(contact);
        assertEquals(contact.getCustID(), created.getCustID());
        System.out.println("Create:" + created);
    }

    @Test
    void  b_read() {
        Contact read = repository.read(contact.getCustID());
        assertNotNull(read);
        System.out.println("Read:"+ read);
    }


    @Test
    void c_update() {
        Contact updated = new Contact.Builder().copy(contact).setCustEmail("217987597@mycput.ac.za")
                .setCustNumber("0743526854")
                .setCustAltNumber("08257985468")
                .setCustID("0035")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Update: "+ updated);
    }

    @Test
    void d_delete() {
        boolean success = repository.delete(contact.getCustID());
        assertTrue(success);
        System.out.println("Delete:"+ success);

    }

    @Test
    void e_getAll() {

        System.out.println("Show all the values");
        System.out.println(repository.getAll());
    }
}