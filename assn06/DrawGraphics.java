import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;


public class DrawGraphics {
    // Bouncer movingSprite;
    // ArrayList<Bouncer> movBouncers;
    // ArrayList<StraightMover> straightMovers;
    ArrayList<Mover> movers;
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        movers = new ArrayList<>();

        Rectangle box1 = new Rectangle(15, 40, Color.BLACK);
        Oval box3 = new Oval(45, 15, Color.CYAN);
        Rectangle box4Rectangle = new Rectangle(20, 40, Color.BLACK);
        Oval box3Oval = new Oval(45, 15, Color.CYAN);

        movers.add(new Bouncer(100, 170, box1));
        movers.add(new Bouncer(200, 200, box3));
        movers.add(new StraightMover(30, 200, box4Rectangle));
        movers.add(new StraightMover(45, 100, box3Oval));

        movers.get(0).setMovementVector(3, 1);
        movers.get(1).setMovementVector(0, 1);
        movers.get(2).setMovementVector(3, 1);
        movers.get(3).setMovementVector(0, 1);
        
        // movBouncers = new ArrayList<>();

        // Rectangle box1 = new Rectangle(15, 40, Color.BLACK);
        // movBouncers.add(new Bouncer(100, 170, box1));
        // movBouncers.get(0).setMovementVector(3, 1);

        // Rectangle box2 = new Rectangle(25, 60, Color.BLUE);
        // movBouncers.add(new Bouncer(40, 100, box2));
        // movBouncers.get(1).setMovementVector(-1, 0);

        // Oval box3 = new Oval(45, 15, Color.CYAN);
        // movBouncers.add(new Bouncer(200, 200, box3));
        // movBouncers.get(2).setMovementVector(0, 1);

        // straightMovers = new ArrayList<>();

        // Rectangle box4Rectangle = new Rectangle(20, 40, Color.BLACK);
        // straightMovers.add(new StraightMover(30, 200, box4Rectangle));
        // straightMovers.get(0).setMovementVector(1, 1);

        // Oval box3Oval = new Oval(45, 15, Color.CYAN);
        // straightMovers.add(new StraightMover(45, 100, box3Oval));
        // straightMovers.get(1).setMovementVector(0, 1);

        // Rectangle box = new Rectangle(15, 20, Color.RED);
        // movingSprite = new Bouncer(100, 170, box);
        // movingSprite.setMovementVector(3, 1);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        // movingSprite.draw(surface);

        // for (Bouncer mov : movBouncers) {
        //     mov.draw(surface);
        // }

        // for (StraightMover mov : straightMovers) {
        //     mov.draw(surface);
        // }

        for (Mover mov : movers) {
            mov.draw(surface);
        }
    }
}
