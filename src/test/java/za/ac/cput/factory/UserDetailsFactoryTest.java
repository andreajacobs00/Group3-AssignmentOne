/*
 * Address POJO Class
 * Author: Haydn Abrahams
 * Date: 06 April 2023
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.UserDetails;

import static org.junit.jupiter.api.Assertions.*;

class UserDetailsFactoryTest {
    @Test
    public void CreateUserTest() {
        UserDetails user = UserDetailsFactory.createUser("12/03/2023",
                "12/03/2023",
                "Jakes2003");
        System.out.println(user);
        assertNotNull(user);
    }

}