package com.lab;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks\n");

        //the creation of the object/characters.
        Wizard Kepweng = new Wizard("Kepweng",10, 100,200);
        Warlock Saruman = new Warlock("Saruman",10,100,200);

        //calling the displayName method to  display the name... di obvious dba hahaha
        Kepweng.displayName();
        Saruman.displayName();

        System.out.println("\nFight Start!!!!");

        //the sequence starts here and Kepweng changes
        Kepweng.c(Saruman);
        Kepweng.statsShower();
        Saruman.statsShower();

        //this the casting a recover spell
        Saruman.spellRegen();
        Kepweng.statsShower();
        Saruman.statsShower();

        Kepweng.java(Saruman);
        Kepweng.statsShower();
        Saruman.statsShower();

        Saruman.amateratsu(Kepweng);
        Kepweng.statsShower();
        Saruman.statsShower();

        //this is the final blow
        Kepweng.c(Saruman);
        Kepweng.levelUP();


    }
}
