package week06;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private  final String  name;

    private final int YearOfBirth;

    private final List<String> courses;

    public Employee(String name, int yearOfBirth, List<String> courses) {
        this.name = name;
        this.YearOfBirth = yearOfBirth;
        this.courses = courses;
    }



    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return YearOfBirth;
    }

    public List<String> getCourses() {
        //return courses;
        return  new ArrayList<>(courses);
        //return  List.copyOf(courses);
        }
    }

