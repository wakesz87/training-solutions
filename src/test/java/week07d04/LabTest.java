package week07d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


class LabTest {
    @Test
    void testCreate() {
        assertFalse(new Lab("Interfesz").isCompleted());
        assertTrue(new Lab("Methods", LocalDate.of(2020,12,11 )).isCompleted());
    }
    @Test
    void testComplete() {
        Lab lab =  new Lab("Methods");
        LocalDate time = LocalDate.of(2020,12,11 );
        lab.complete(time);
        assertEquals(time, lab.getCompletedAt());
    }
    @Test
    void testComplete2() {
        Lab lab = new Lab("Methods");
        LocalDate time = LocalDate.now();
        lab.complete(time);
        assertEquals(time, lab.getCompletedAt());
    }



}
