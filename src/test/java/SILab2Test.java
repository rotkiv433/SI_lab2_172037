import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SILab2Test {



    @Test
    public void test1() {
        User user1 = new User("korisnik", "lozinka123", "adresa@gmail.com");
        User user2 = null;
        User user3 = new User("korisnik1", "lozinkaaaa", "eadresa@something.com");
        User user4 = new User("korisnikmkd", "password", "thisisnotanemail");
        User user5 = new User("korisnikkkkkk", "l0z1nka", "emailwith@withoutdot");
        List<String> allUsers = new ArrayList<>(5);
        allUsers.add("korisnik1");
        allUsers.add("korisnik2");
        allUsers.add("korisnik3");
        allUsers.add("korisnik4");
        allUsers.add("123123");

        assertTrue(SILab2.function(user1, allUsers));
        assertFalse(SILab2.function(user2, allUsers));
        assertFalse(SILab2.function(user3, allUsers));
        assertFalse(SILab2.function(user4, allUsers));
        assertFalse(SILab2.function(user5, allUsers));
    }

    @Test
    public void test2() {
        User user1 = new User("user1", "p@ssW0rd", "email@gmail.com");
        User user3 = new User("userrr", "passwoooooord", "thisagoodemail@email.email");
        User user4 = new User("thisismyname", "holyJesus", "surpise_not_an_email");
        User user5 = new User("ooserName", "iCantTellIt", "whomakesanemail@withoutadot?");
        List<String> allUsers = new ArrayList<>(5);
        allUsers.add("usernamee");
        allUsers.add("userrr");
        allUsers.add("whatisthis?");
        allUsers.add("betterCallSaul");
        allUsers.add("thisIsJimmyMcGill");

        assertTrue(SILab2.function(user1, allUsers));
        assertFalse(SILab2.function(null, allUsers));
        assertFalse(SILab2.function(user3, allUsers));
        assertFalse(SILab2.function(user4, allUsers));
        assertFalse(SILab2.function(user5, allUsers));
    }
}
