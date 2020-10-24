package com.university;

public class Student {

    private String name; //property of Student class (class kinda like template)

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String nameToUpperCase() {
        return name.toUpperCase();
    }

    @Override //default toString() method is useless so we override it so as to provide more useful info
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}