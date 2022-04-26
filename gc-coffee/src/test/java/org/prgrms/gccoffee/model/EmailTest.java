package org.prgrms.gccoffee.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    public void testInvalidEmail(){
        assertThrows(IllegalArgumentException.class, ()->{
            var email = new Email("acccc");
        });
    }

    @Test
    public void testValidEmail(){
        var email = new Email("duliesoures@gmail.com");
        assertTrue(email.getAddress().equals("duliesoures@gmail.com"));
    }

    @Test
    public void testEqualEmail(){
        var email = new Email("duliesoures@gmail.com");
        var sameEmail = new Email("duliesoures@gmail.com");
        assertTrue(email.equals(sameEmail));
    }
}