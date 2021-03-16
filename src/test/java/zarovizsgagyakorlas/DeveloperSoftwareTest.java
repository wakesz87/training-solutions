package zarovizsgagyakorlas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperSoftwareTest {

    @Test
    void increasePrice() {
        Software sf = new DeveloperSoftware("windows", 1000);
        sf.increasePrice();
        assertEquals(1100.0,sf.getPrice());
    }

}