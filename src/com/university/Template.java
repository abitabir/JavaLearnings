package com.university;
//depends on your design where you place objects and if you make them static or not, good practices and bad practices
public class Template {

    private static Student studentA = new Student("student A"); //using static causes more errors, risky
    //because it keeps messing with the class 'template' as opposed to the instance 'filled out form'
    //studentA belongs to the class Template, whereas studentB belongs to instance form which in turn belongs to the class Template

    private Student studentB = new Student("student B"); //even this practice is risky but depends on overall architechture


    public static void main(String[] args) {

        System.out.println(Template.studentA); //here is where studentA is called

        Template form = new Template();
        System.out.println(form.studentB); //here is where studentB is called

        //Student student = new Student();
    }

}
