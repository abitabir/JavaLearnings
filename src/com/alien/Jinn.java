package com.alien;

public class Jinn {

    private String madeFrom;
    private boolean invisible;

    public Jinn(String madeFrom, boolean invisible) { //this is a constructor (special kind of method invoked when we create new object)
        this.madeFrom = madeFrom;  //this makes Jinn immutable unlike Angel
        this.invisible = invisible;
    }

    public String getMadeFrom() {
        return madeFrom;
    } //this is a simple accessor method

    public boolean isInvisible() { return invisible; } //this is another accessor method that takes no parameter but returns the current attribute of the created object

    @Override
    public String toString() {
        return "Jinn{" +
                "madeFrom='" + madeFrom + '\'' +
                ", invisible=" + invisible +
                '}';
    }
}
