package com.humans;

public class Professional extends Person {
    //defining attributes {properties} of class
    private String profession;
    private String salary;

    public Professional(String firstName, String surName, String dateOfBirth, String phoneNumber,
                        String emailAddress, String niNumber, String profession, String salary) {
        super(firstName, surName, dateOfBirth, phoneNumber, emailAddress, niNumber);
        this.profession = profession;
        this.salary = salary;
    }

    //defining behaviours {what it can do} of class
    public String getProfession() {
        return profession;
    }
    public String getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Professional{" +
                "profession='" + profession + "\'" +
                ", salary='" + salary + "\'" +
                "}";
    }

}
