package com.alien;

public class Klingon {

    private boolean horn;
    private boolean bilingual;
    private String motherTongue;

    public Klingon() { //default constructor is empty and it doesn't take any arguments - this is an alternative,
        // more longwinded way of setting attributes to an object via getters AND setters;
        //unlike in HumanKind, where we passed parameters as arguments into the constructor,
        // here, we give set values specific to the object via its setter methods
    }

    //getters
    public boolean isHorn() { //for booleans, isHorn instead of getHasHorn for strings
        return horn;
    }
    public boolean isBilingual() {
        return bilingual;
    }
    public String getMotherTongue() {
        return motherTongue;
    }
    //setters
    public void setHorn(boolean horn) {
        this.horn = horn;
    }
    public void setBilingual(boolean bilingual) {
        this.bilingual = bilingual;
    }
    public void setMotherTongue(String motherTongue) {
        this.motherTongue = motherTongue;
    }

    @Override
    public String toString() {
        return "Klingon{" +
                "horn=" + horn +
                ", bilingual=" + bilingual +
                ", motherTongue='" + motherTongue + '\'' +
                '}';
    }
}
