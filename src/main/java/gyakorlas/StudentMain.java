package gyakorlas;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Name");
        String name = sc.next();
        System.out.println("Age");
        int age = sc.nextInt();
        Student std = new Student(name, age);
        System.out.println("Original object");
        std.displayData();
        System.out.println("Copied object");
        Student copyOfStd = new Student(std);
        copyOfStd.displayData();
    }
}

