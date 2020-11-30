package immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CelestialCoordinatesTest {
    @Test
    void testToString() {
        //given
        CelestialCoordinates celestialCoordinates = new CelestialCoordinates(12,23,45);
       //When
        int x = celestialCoordinates.getX();
        int y = celestialCoordinates.getY();
        int z = celestialCoordinates.getZ();
        //Then
        assertEquals("12", x);
    }



}