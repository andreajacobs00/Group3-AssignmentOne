package za.ac.cput.factory;

import za.ac.cput.domain.Contact;
import za.ac.cput.util.Helper;

public class ContactFactory {

    public static Contact createContact(String custNumber, String custID, String custEmail, String custAltNumber){

        //ensuring that the values are valid


        if(Helper.isNullorEmpty(custAltNumber) || Helper.isNullorEmpty(custAltNumber))
            return null;


        // for cust id
//       String custID = Helper.generateId();
//       return null;

        // }
        if(!Helper.isValidEmail(custEmail))
            return null;

        return new Contact.Builder().setCustNumber(custNumber)
                .setCustID(custID)
                .setCustEmail(custEmail)
                .setCustAltNumber(custAltNumber)
                .build();
    }
}
