package week06;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

 public class EmployeeTest {

     @Test
     public void testEmpleyeeImmutable() {
         List<String> courses = new ArrayList<>();
         courses.add("Java");
         courses.add("Python");
         courses.add("C++");


         Employee employee = new Employee("Kiss Szabolcs", 1987, courses);

         employee.getCourses().add("C#");


         assertEquals(3, employee.getCourses().size());


     }
 }