package com.humans;
// in java everything must be written within a class unlike in python
public class CommunityCentre {//standards: class names must be CamelCase but method must be camelCase
                        //this is a 'driver' class since it contains the main method which causes object creation

    public static void main(String[] args) { //this is the main method which causes object/instances creation - th only constructor when child classes

        var muchu = new Pensioner("Musab", "Rizwan-Ullah", "08/09/2002",
                "07123", "badsinger@weeb.com", "baaah",
                "0000 he can't be trusted with any monies", "blind as a bat");
        var mama = new Student("Mahnaz", "Madni/Rizwan-Ullah", "12/04/1975",
                "07123 i mean i know it off by heart but privacy man", "adorablest@cutiepie.com",
                 "koochiwoochi", "7LEDGENDS", "Sheffield College");
        var baba = new Professional("Rizwan", "Ullah", "12/11/1973",
                "07123 ditto", "rijjurizzumian@complainy.com", "shat APPP",
                "Professional Akarkhan", "he shall not disclose to anyone");

        System.out.println(muchu);
        System.out.println(mama);
        System.out.println(baba);

    }

}
