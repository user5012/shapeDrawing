package net.kyrma.app_drawer.window;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow {
    String title;
    int width;
    int height;
    private JFrame frame;
    private ArrayList<JButton> buttons;

    void craftWindow() {
        this.frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setLayout(null);
        for (JButton button : buttons) {
            frame.add(button);
        }
    }

    public MyWindow(String title, int width, int height, ArrayList<JButton> buttons) {
        this.title = title;
        this.width = width;
        this.height = height;
        this.buttons = buttons;
        craftWindow();

    }

    public void ShowWindow() {
        frame.setVisible(true);
    }

}
