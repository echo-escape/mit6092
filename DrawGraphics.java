import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
public class DrawGraphics {
    BouncingBox box;
    ArrayList<BouncingBox> boxes;
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box = new BouncingBox(200, 50, Color.RED);
        boxes = new ArrayList<>();

        boxes.add(new BouncingBox(50, 100, Color.blue));
        boxes.add(new BouncingBox(100, 200, Color.RED));
        boxes.add(new BouncingBox(75, 150, Color.BLACK));

        for (BouncingBox boxSingle : boxes) {
            boxSingle.setMovementVector(0, -2);
        }

        boxes.get(0).setMovementVector(5, 0);
        boxes.get(1).setMovementVector(4, -1);
        boxes.get(2).setMovementVector(4, 1);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(12, 50, 250, 250);
        box.draw(surface);

        for (BouncingBox boxSingle : boxes) {
            boxSingle.draw(surface);
        }
    }
} 