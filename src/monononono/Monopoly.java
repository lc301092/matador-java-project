package monononono;

public class Monopoly {

    public final static int FIELD_COUNT = 40;

    private final static int ROUND_MAX = 7;
    private int roundCounter;

// statisk array
    public static Field[] fields;
    // 2 spillere 
    private Player p1, p2;
//    private Player p2;
    public final static int START_MONEY = 4000;
   
    public void gameStart() {

        fields = new Field[40];
        for (int i = 0; i < FIELD_COUNT; i++) {

            fields[i] = (new Field(i, "felt " + i));
        }
        System.out.println("Game setup complete");
        p1 = new Player(new DiceCup(6), "Miriam", fields[0], START_MONEY);
        p2 = new Player(new DiceCup(6), "Luca", fields[0], START_MONEY);
        
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
