package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class Employee {
    private String name;
    private LocalDate dateOfBirth;
    private LocalDateTime beginOfEmployment;

    public Employee(int year, int month, int day, String name) {
        this.name = name;
        this.dateOfBirth = LocalDate.of(year,month,day);
        this.beginOfEmployment = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }


    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDateTime getBeginOfEmployment() {
        return beginOfEmployment;
    }

    public void setName(String name) {
        this.name = name;
    }
}
