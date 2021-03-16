package zarovizsgagyakorlas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficeSoftwareTest {

    @Test
    void increasePrice(){
        Software sf = new OfficeSoftware("linux",1000);
        sf.increasePrice();
        assertEquals(1050, sf.getPrice());




        }
    }

