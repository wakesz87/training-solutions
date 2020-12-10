package week07;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;

    private List<Course> courses = new ArrayList<>();

    public Trainer (String name){
        this.name = name;
    }

    public void addCourse(String name){
        courses.add(new Course(name));
    }

    public void addCourses(){

    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }
}


