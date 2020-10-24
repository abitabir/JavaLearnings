package com.humans;

public class Person {

    static String species = "Hooman"; //most of the time statics do not change
    // class is quite like a template, we haven't created the actual content yet

    // file name must exactly match class name
    // in java all code must exist within a class
    private String firstName; //defining an attribute (data/properties of the object) within this class and setting field names
    private String surName;
    private String dateOfBirth;
    private String phoneNumber;
    private String emailAddress;
    private String niNumber;


    public Person() { //empty constructor better to have for inheritance, java will automatically create one if not in code
    }

    public Person(String firstName, String surName, String dateOfBirth, String phoneNumber, String emailAddress, String niNumber) {
        //constructor is a method that has to be called right before object creation
        //constructor has same name as class name and does not return anything unlike the later getter methods
        this.firstName = firstName;//defining global variable as local variable
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.niNumber = niNumber;
    }

    //public and private among others are called access modifiers
    //private field names (that are defined by attributes), unlike their public counterparts, are only seen within the class in which they are defined
    //below we define behaviour via getter methods as public,
    // after having made field names defined via attributes as private,
    // so we don't need external classes to modify the attributes directly
    // the getter methods are used so that data is availible to the outside world
    public String getFirstName() { //getFirstName is a method, basically Java equivalent of the Python function
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getNiNumber() {
        return niNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", niNumber='" + niNumber + '\'' +
                '}';
    }
}
