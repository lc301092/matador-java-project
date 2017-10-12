package monopoly;


public class Monopoly implements MonopolyConstants {

    public final static int FIELD_COUNT = 40;

    private final static int ROUND_MAX = 10;
    
    private int roundCounter;

// statisk array
    public static OwnableField[] fields;
    // 2 spillere 
    private Player p1, p2;
//    private Player p2;
   
    public void gameStart() {

        fields = new OwnableField[40];
        for (int i = 0; i < FIELD_NAMES.length; i++) {
        // loop works as intended
            
        }
        System.out.println("Game setup complete");
        p1 = new Player(new DiceCup(6), "Miriam", new Field(0, "PLACEHOLDER") , START_MONEY);
        p2 = new Player(new DiceCup(6), "Luca",new Field(0, "PLACEHOLDER") , START_MONEY);
        
        newRound();
    }

    public void newRound() {
        roundCounter++;
        if (roundCounter > ROUND_MAX) {
            System.out.println("Game is over now");
        } else {
            System.out.println("Round " + roundCounter);
            // spiller 1 skal slå og flytte sig
            p1.move();
            // spiller 2 skal slå og flytte sig
            p2.move();
            // hvis spillet ikke er over, startes en ny runde.
            newRound();
        }
    }
}
