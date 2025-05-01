package Shape;

import java.awt.*;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius, int x, int y) {
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw(Graphics g) {
        g.drawOval(getX(), getY(), radius * 2, radius * 2); // Draw the circle
    }
}
