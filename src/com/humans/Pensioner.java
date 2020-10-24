package com.humans;

public class Pensioner extends Person {

    private String pensionAmount;
    private String additionalRequirements;

    public Pensioner(String firstName, String surName, String dateOfBirth, String phoneNumber,
                     String emailAddress, String niNumber, String pensionAmount, String additionalRequirements) {
        //order doesn't matter but keep same for readibility's sake, so code can be maintained much more easily - and that's all programming is about
        super(firstName, surName, dateOfBirth, phoneNumber, emailAddress, niNumber);
        this.pensionAmount = pensionAmount;
        this.additionalRequirements = additionalRequirements;
    }

    public String getPensionAmount() {
        return pensionAmount;
    }
    public String getAdditionalRequirements() {
        return additionalRequirements;
    }


    @Override
    public String toString() {
        return "Pensioner{" +
                "pensionAmount='" + pensionAmount + "\'" +
                ", additionalRequirements='" + additionalRequirements + "\'" +
                "}";
    }

}