package com.humans; //upon compilation, this is the line that causes module creation
// in java everything must be written within a class unlike in python
public class HumanKind {//standards: class names must be CamelCase but method must be camelCase
                        //this is a driver class since it contains the main method which causes object creation

    public static void main(String[] args) { //this is the main method which causes object creation - th only constructor when child classes

        var abir = new Person("Khalidaabir", "Rizwanullah",
                "13/04/2001", "0790023", "a@b.com", "PW88383D");
        //abir is one of few instances of Person
        //abir is variable name which references the object/instance
        var iffy = new Person("Ifrah", "Bukhari",
                "15/12/2000", "0790023", "eurghhhihateyou@b.com", "PW88383D");
        var beni = new Person("Benita", "Mugisho",
                "17/01/2001", "0790023", "pshawokurrr@b.com", "PW88383D");
        var melly = new Person("Melanie", "Ho",
                "27/01/2001", "0790023", "disaasteroushungry@b.com", "PW88383D");
        System.out.println(abir);
        System.out.println(iffy);
        System.out.println(beni);
        System.out.println(melly);
        System.out.println(Person.species); //accessing String object called with variable name species directly from class Person because it is is static,
        // and so can be accessed by psvm and instances of class Person
    }

}
