/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author Luca Casa
 */
public class Player {

    private DiceCup cup;
    private String name;
    private Field currentField;

    public Player(DiceCup cup, String name, Field startField) {
        this.cup = cup;
        this.name = name;
        this.currentField = startField;
        System.out.println("player " + name + " joined the game.");
    }

    public void move() {
        // current position
        int curPos = currentField.getFieldNumber();
        System.out.println(name + " before roll " + curPos);
        // the active player throws the cup
        int roll = cup.throwCup();
        System.out.println(name + " this is the roll " + roll);
        // return the new position
        curPos += roll;
        
        // THIS IS BAD: You are actually assigning a new position to the field itself, which the player is on. Try assigning another field to the player instead.
        // (or even better, just give the player the field number and ask the game (Monopoly) for info about the field using that number as an index.
        // Example: Field f = getField(player.fieldNumber))
        currentField.setFieldNumber(curPos);
        // Bad part: ^^^^^^^^^^^^^^^^^^^^^^
        
        System.out.println(name + " after roll " + curPos);
        // return curPos; // VIGTIG! skal indsættes i arrayet! curpos er en INTEGER, 
        //men det er alle indexpladserne i arrayet ikke. Det er Fields instancer 

    }

}
