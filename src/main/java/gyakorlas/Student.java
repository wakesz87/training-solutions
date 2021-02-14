package gyakorlas;


public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(Student std) {
        this.name = std.name;
        this.age = std.age;
    }

    public void displayData() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }
}