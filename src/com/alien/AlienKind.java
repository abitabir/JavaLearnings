package com.alien; //packages within packages - alien is a subpackage. also src is the folder in which all the source files {containing code} go
//it is not the language's syntax but it is the langauge's convention that package names are written in lowercase and class names in CamelCase

public class AlienKind {
    public static void main(String[] args) {

        //Klingon object creation
        Klingon worf = new Klingon();
        System.out.println(worf);

        //worf has default values for attributes

        worf.setBilingual(true);
        worf.setHorn(true);
        worf.setMotherTongue("Klingonese");

        // we have changed the attributes
        System.out.println(worf);

        //Angel object creation
        Angel jibreel = new Angel();
        System.out.println(jibreel);

        jibreel.setHasWings(true);
        jibreel.setMadeFrom("light");

        System.out.println(jibreel);

        //Jinn object creation
        Jinn iblis = new Jinn("fire", true);
        System.out.println(iblis);



    }
}
