import window.MyButtons;
import window.MyWindow;
import javax.swing.JButton;

import Shape.Rectangle;

import Shape.Circle;

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        MyButtons button1 = new MyButtons("Click Me", 100, 50, 100, 30, () -> {
            System.out.println("Button clicked!"); // Action to perform when the button is clicked
        }); // Add a button at (50, 50) with size (100, 30)
        ArrayList<JButton> buttons = new ArrayList<>();
        ArrayList<Circle> circles = new ArrayList<>();
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(50, 50, 200, 200)); // Add a rectangle with
        buttons.add(button1.getButton()); // Add the button to the list of buttons

        MyWindow window = new MyWindow("My Application", 800, 600, buttons, circles, rectangles);
        window.ShowWindow();

    }
}