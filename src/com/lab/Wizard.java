package com.lab;

public class Wizard extends Character{
    Wizard(String name, int newLevel, int newHealth, int newMana){
        super(name,newLevel,newHealth,newMana);

    }

    //this two methods is the attacks
    public void c(Character enemyCharacter){

        int damagePoints = 99;
        int manaCost = 25;
        manaPoints -= manaCost;

        System.out.println("***************************************************************");
        System.out.println(super.characterName + " Attacks " + enemyCharacter.characterName + " with C Programming Language (Damages "+ damagePoints +")");
        damageTarget(enemyCharacter, damagePoints);
    }
    public void java(Character enemyCharacter){
        int damagePoints = 80;
        int manaCost = 60;
        manaPoints -= manaCost;

        System.out.println("***************************************************************");
        System.out.println(super.characterName + " Attacks " + enemyCharacter.characterName + " with Java (Damages "+ damagePoints +")");
        damageTarget(enemyCharacter, damagePoints);
    }

    //this is the healing spell
    public void regenTeknik(){
        int heal = 30;
        int manaRegen = 60;

        healthPoints += heal;
        manaPoints += manaRegen;

        System.out.println("***************************************************************");
        System.out.println(super.characterName +" use Spell Regen (Health +"+ heal +")" + " (Mana +"+ manaRegen +")");
    }

}