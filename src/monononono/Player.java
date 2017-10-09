/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monononono;

/**
 *
 * @author Luca Casa
 */
public class Player {

    private int roundsOnField;
    private DiceCup cup;
    private String name;
    private Field currentField;
    private int money; 

    public Player(DiceCup cup, String name, Field startField, int money) {
        this.cup = cup;
        this.name = name;
        currentField = startField;
        this.money = money;
        System.out.println("player " + name + " joined the game.");
    }

    public void move() {
        // current position
        int curPos = currentField.getFieldNumber();
        // the active player throws the cup
        int roll = cup.throwCup();
        System.out.println(name + " rolls " + roll);
        // return the new position
        curPos += roll;

        if (curPos >= Monopoly.FIELD_COUNT) {
            curPos = curPos % Monopoly.FIELD_COUNT;
            roundsOnField++;
            currentField = Monopoly.fields[curPos];
            System.out.println(name + " moves to space " + curPos);
            System.out.println(name + "has now passed the round marker: " + roundsOnField + " times and gets an additional: " + Monopoly.START_MONEY);
            money += Monopoly.START_MONEY;
            System.out.println(name + " now has " + money);
        } else {
            currentField = Monopoly.fields[curPos];
            System.out.println(name + " moves to space " + curPos);

        }

    }

}
