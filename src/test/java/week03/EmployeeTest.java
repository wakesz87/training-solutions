package week03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


 class EmployeeTest {

    @Test
  void testCreateEmployee() {
    //Given
        Employee employee = new Employee("Szabolcs" , 23);

        //When
        String name = employee.getName();

        //Then
        assertEquals("Szabolcs" , name);
    }

    @Test
     public void testHaveBirthDay() {
        Employee employee = new Employee("Jack", 32);
     assertEquals(32,employee.getAge());
     employee.haveBirthday();
     assertEquals(32, employee.getAge());
    }

}
