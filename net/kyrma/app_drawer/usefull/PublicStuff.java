package usefull;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import Shape.Circle;
import Shape.Rectangle;
import window.MyWindow;

public class PublicStuff {
    public static final int WIDTH = 800; // Width of the window
    public static final int HEIGHT = 600; // Height of the window
    public static final String TITLE = "My Application"; // Title of the window

    // Add any other public constants or methods that you need to share across your
    // application

    public static Boolean isRectSelected = false; // Flag to check if a rectangle is selected
    public static Boolean isCircleSelected = false; // Flag to check if a circle is selected
    public static Boolean isMousePressed = false; // Flag to check if the mouse is pressed
    public static MyWindow window; // Reference to the MyWindow instance
    public static JFrame frame; // Reference to the JFrame instance

    public static ArrayList<JButton> buttons = new ArrayList<>();
    public static ArrayList<Circle> circles = new ArrayList<>();
    public static ArrayList<Rectangle> rectangles = new ArrayList<>();

    public static void addButton(JButton button) {
        buttons.add(button); // Add a button to the list
    }

    public static void addCircle(int x, int y) {
        circles.add(new Circle(10, x, y)); // Add a new circle to the list with a radius of 50
        frame.repaint(); // Repaint the frame to update the shapes
    }

    public static void addRectangle(int x, int y) {
        rectangles.add(new Rectangle(50, 30, x, y)); // Add a new rectangle to the list with width 50 and height 30
        frame.repaint(); // Repaint the frame to update the shapes
    }
}
