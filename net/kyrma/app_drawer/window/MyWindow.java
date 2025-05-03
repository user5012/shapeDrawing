package window;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import Shape.Circle;
import Shape.Rectangle;

public class MyWindow {
    String title;
    int width;
    int height;
    private JFrame frame;
    private ArrayList<JButton> buttons;
    private ArrayList<Circle> circles;
    private ArrayList<Rectangle> rectangles;
    private JPanel panel;

    void canvas(int canvasWidth, int canvasHeight) {
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                for (Circle circle : circles) {
                    circle.draw(g); // Draw the circle
                }
                for (Rectangle rectangle : rectangles) {
                    rectangle.draw(g); // Draw the rectangle
                }
            }
        };
        panel.setPreferredSize(new Dimension(canvasWidth, canvasHeight)); // Set the preferred size of the panel
        panel.setLayout(null); // Use null layout for absolute positioning
    }

    void craftWindow() {
        this.frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setLayout(new FlowLayout()); // Use FlowLayout for the frame
        frame.add(panel);
        for (JButton button : buttons) {
            frame.add(button); // Add the button to the frame
        }
        frame.pack(); // Pack the frame to fit the components

    }

    public MyWindow(String title, int width, int height, ArrayList<JButton> buttons, ArrayList<Circle> circles,
            ArrayList<Rectangle> rectangles) {
        this.title = title;
        this.width = width;
        this.height = height;
        this.buttons = buttons;
        this.circles = circles;
        this.rectangles = rectangles;
        canvas(400, 400);
        craftWindow();

    }

    public void ShowWindow() {
        frame.setVisible(true);
    }

    public void repaint() {
        panel.repaint(); // Repaint the panel to update the shapes
    }

    public JFrame getFrame() {
        return frame; // Return the JFrame object
    }

}
