package introdate;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee(1987,12,8, "Kiss Szabolcs") ;
        System.out.println("Kiss Szabolcs");
        System.out.println(employee.getDateOfBirth());
        System.out.println(employee.getBeginOfEmployment());

    }
}
