package com.humans;

public class Student extends Person { //Student is a superset of Person, since its objects are to contain additional attributes along with Person's
    //defining attributes via field names e.g form
    private String form;
    private String institution;

    public Student(String firstName, String surName, String dateOfBirth, String phoneNumber,
                   String emailAddress, String niNumber, String form, String institution) { //constructor for Student including extra fieldnames
        super(firstName, surName, dateOfBirth, phoneNumber, emailAddress, niNumber);
        //calling the attributes from parentclass/superclass so do not need to redefine the behaviours
        this.form = form;
        this.institution = institution;
        //need to define the attributes, and later defining the behaviours to access these attributes, that are specific to this childclass

    }
    //defining behaviors via methods
    public String getForm() {
        return form;
    }
    public String getInstitution() {
        return institution;
    }

    @Override //every class (even Person class) in Java extends from Object class, and toString is a method
    public String toString() { //basically a standard formatter for when outputting
        return "Student{" +
                "form='" + form + "\'" +
                ", institution='" + institution + "\'" +
                "}";
    }
}
