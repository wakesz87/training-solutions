package week03;

public class Employee {

    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void haveBirthday() {
        age++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
