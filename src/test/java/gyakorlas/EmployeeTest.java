package gyakorlas;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void testEmployeeImmutable() {
        List<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("c++");
        Employee employee = new Employee("Szabolcs", 1987,courses);

        //employee.getCourses().add("C+");

        assertEquals(2,employee.getCourses().size());
    }

}