package com.github.curriculeon;

public enum AliceBobEnum {
    ALICE("ALICE"), BOB("BOB");
    private final String name;
    AliceBobEnum(String name){
        this.name = name;
    }

    public String getCatchPhrase() {
        return("Hey, my name is "+ this.name + "!");
    }

    public boolean isAlice() {
        if (this.name.equals("ALICE")) return true;
        return false;
    }

    public boolean isBob() {
        if (this.name.equals("BOB")) return true;
        return false;
    }
}
