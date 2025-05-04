package Shape;

import java.awt.*;

public abstract class MyShape {
    private int x;
    private int y;

    public MyShape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract void draw(Graphics g); // Abstract method to be implemented by subclasses
}
