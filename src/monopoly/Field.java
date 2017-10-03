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
public class Field {

    private int fieldNumber;
    private String fieldName;

    public Field(int space, String name) {
        this.fieldNumber = space;
        this.fieldName = name;
    }

    // skal skrives om, når Player class og Monopoly class er programmeret
    public String toString() {
        return "Feltets plads i arrayer er index: " + fieldNumber + " og feltet hedder i spillet: " + fieldName;
    }

    int getFieldNumber() {
        return this.fieldNumber;
    }

    String getSpaceName() {
        return this.fieldName;
    }
    
    void setFieldNumber(int newPos) {
        // Run code and realize that it is the internal field number which changes, not the field the player is standing on.
        // NOTE: The problem reveals itself because both players are assigned the SAME field.
        System.out.println("Field number was changed for field: " + super.toString());
        this.fieldNumber = newPos;
    }

}
