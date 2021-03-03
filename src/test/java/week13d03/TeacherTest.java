package week13d03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.InputStreamReader;

public class TeacherTest {

    @Test
    public void testTeacher() {
        InputStreamReader isr = new InputStreamReader(TeacherTest.class.getResourceAsStream("/beosztas.txt"));
        Assertions.assertEquals(0, new Teacher().getNumber(isr, "Kaffer Kada"));

        InputStreamReader isr2 = new InputStreamReader(TeacherTest.class.getResourceAsStream("/beosztas.txt"));
        Assertions.assertEquals(3, new Teacher().getNumber(isr2, "Albatrosz Aladin"));

        InputStreamReader isr3 = new InputStreamReader(TeacherTest.class.getResourceAsStream("/beosztas.txt"));
        Assertions.assertEquals(2, new Teacher().getNumber(isr3, "Csincsilla Csilla"));
    }
}