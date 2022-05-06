package com.lab;

public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;


    //this is the Non Parameterized Constructor
    Character(){
        System.out.println("Non Parameterized Constructor");
    }

    //this is the parameterized constructor
    Character(String name, int newLevel, int newHealth, int newMana){
        characterName = name;
        level = newLevel;
        manaPoints = newMana;
        healthPoints = newHealth;
    }

    //this is the method that displays the name of the character
    public void displayName(){
        System.out.println("Character Initialized "+ characterName);
    }


    //this is the method to damage target a character
    public void damageTarget(Character enemyCharacter,int damagePoints){

        //ang silbi ng line na ito ay taga minus ng HP ng kalaban
        enemyCharacter.healthPoints -= damagePoints;

        //this line show the remaining HP of the enemy
        System.out.println(enemyCharacter.characterName +" HP Left = " + enemyCharacter.healthPoints);

        //this if statement will decide who will win based on the condition
        if (enemyCharacter.healthPoints <= 0) {
            System.out.println("***************************************************************");
            System.out.println("Character "+ enemyCharacter.characterName +" Defeated");

            /**
             * you can also put the level up here to be more simple if you use this you can just simply change
             * the outcome of the sequence by just changing the damage's of the attack
             * int levelUp = 10;
             * level += levelUp;
             *
             * System.out.println(characterName +" Leveled up to Level "+ level);
             * System.out.println("Congrats "+ characterName +"!!!");
             * System.exit(0); //this is for immediately stopping the program when a character is defeated
             */


        }
    }

    //this is the method to show the status of the character
    public void statsShower(){
        System.out.println("***************************************************************");
        System.out.println(characterName +" Current Status \nHP "+ healthPoints +"\nMana "+ manaPoints);

    }

    //this is the method that increases the level of the winner
    public void levelUP(){
        int levelUp = 10;
        level += levelUp;

        System.out.println(characterName +" Leveled up to Level "+ level);
        System.out.println("Congrats "+ characterName +"!!!");
    }

}
