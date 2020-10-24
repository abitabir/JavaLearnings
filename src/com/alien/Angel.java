package com.alien;

public class Angel {

    //make habit to write attributes, then constructors, then setters and or getters

    private boolean hasWings;
    private String madeFrom;

    public Angel() {
    }

    public boolean isHasWings() {
        return hasWings;
    }

    public String getMadeFrom() {
        return madeFrom;
    }

    public void setHasWings(boolean hasWings) {
        this.hasWings = hasWings;
    } //setters/mutator allow objects to be mutable i.e changed from outside, i.e. they can be changed during

    public void setMadeFrom(String madeFrom) {
        this.madeFrom = madeFrom;
    }

    @Override
    public String toString() {
        return "Angel{" +
                "hasWings=" + hasWings +
                ", madeFrom='" + madeFrom + '\'' +
                '}';
    }
}
