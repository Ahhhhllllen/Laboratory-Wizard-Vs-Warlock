package com.lab;

public class Warlock extends Character{
    Warlock(String name, int newLevel, int newHealth, int newMana){
        super(name,newLevel,newHealth,newMana);
    }
    //this two methods is the attacks
    public void hellFire(Character enemyCharacter){

        int damagePoints = 90;
        int manaCost = 25;
        manaPoints -= manaCost;

        System.out.println("***************************************************************");
        System.out.println(super.characterName + " Attacks " + enemyCharacter.characterName + " with Hell Fire (Damages "+ damagePoints +")");
        damageTarget(enemyCharacter, damagePoints);
    }
    public void amateratsu(Character enemyCharacter){

        int damagePoints = 99;
        int manaCost = 50;
        manaPoints -= manaCost;

        System.out.println("***************************************************************");
        System.out.println(super.characterName + " Attacks " + enemyCharacter.characterName + " with Amateratsu (Damages "+ damagePoints +")");
        damageTarget(enemyCharacter, damagePoints);
    }

    //this is the regen spell
    public void spellRegen(){
        int heal = 100;
        int manaRegen = 40;

        healthPoints += heal;
        manaPoints += manaRegen;

        System.out.println("***************************************************************");
        System.out.println(super.characterName +" use Spell Regen (Health +"+ heal +")" + " (Mana +"+ manaRegen +")");
    }

}
