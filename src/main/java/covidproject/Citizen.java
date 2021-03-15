package covidproject;

import java.time.LocalDateTime;

public class Citizen {

    private int id;
    private  String fullName;
    private String postCode;
    private byte age;
    private String email;
    private String tajId;
    private byte numberOfVaccination;
    private LocalDateTime lastVaccinationDateTime;
    private Status status;
    private VaccineType vaccineType;

    public Citizen(String fullName, String postCode, byte age, String email, String tajId) {
        this.fullName = fullName;
        this.postCode = postCode;
        this.age = age;
        this.email = email;
        this.tajId = tajId;
    }

    public Citizen(int id, byte numberOfVaccination, LocalDateTime lastVacinationDateTime) {
        this.id = id;
        this.numberOfVaccination = numberOfVaccination;
        this.lastVaccinationDateTime = lastVacinationDateTime;
    }

    public Citizen(int id, String fullName, byte numberOfVaccination, LocalDateTime lastVacinationDateTime, VaccineType vaccineType) {
        this.id = id;
        this.fullName = fullName;
        this.numberOfVaccination = numberOfVaccination;
        this.lastVaccinationDateTime = lastVacinationDateTime;
        this.vaccineType = vaccineType;
    }

    public Citizen(int id, String fullName, byte numberOfVaccination, LocalDateTime lastVacinationDateTime, Status status, VaccineType vaccineType) {
        this.id = id;
        this.fullName = fullName;
        this.numberOfVaccination = numberOfVaccination;
        this.lastVaccinationDateTime = lastVacinationDateTime;
        this.status = status;
        this.vaccineType = vaccineType;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPostCode() {
        return postCode;
    }

    public byte getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getTajId() {
        return tajId;
    }

    public byte getNumberOfVaccination() {
        return numberOfVaccination;
    }

    public LocalDateTime getLastVaccinationDateTime() {
        return lastVaccinationDateTime;
    }

    public Status getStatus() {
        return status;
    }

    public VaccineType getVaccineType() {
        return vaccineType;
    }

    @Override
    public  String toString(){
        return "Citizen{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", postCode=" + postCode +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", tajId='" + tajId + '\'' +
                ", numberOfVaccination=" + numberOfVaccination +
                ", lastVaccinationDateTime=" + lastVaccinationDateTime +
                '}';
    }
}
