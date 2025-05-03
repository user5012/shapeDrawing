package window;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import usefull.PublicStuff;

public class MyMouseHandler {

    public static void getClicks() {
        PublicStuff.frame.getContentPane().addMouseListener(new MouseAdapter() {
            /*
             * @Override
             * public void mousePressed(java.awt.event.MouseEvent e) {
             * if (e.getButton() == java.awt.event.MouseEvent.BUTTON1) {
             * leftPressed = true;
             * mousePos.setX(e.getX());
             * mousePos.setY(e.getY());
             * } else if (e.getButton() == java.awt.event.MouseEvent.BUTTON3) {
             * rightPressed = true;
             * mousePos.setX(e.getX());
             * mousePos.setY(e.getY());
             * }
             * }
             * 
             * @Override
             * public void mouseReleased(java.awt.event.MouseEvent e) {
             * if (e.getButton() == java.awt.event.MouseEvent.BUTTON1) {
             * leftPressed = false;
             * } else if (e.getButton() == java.awt.event.MouseEvent.BUTTON3) {
             * rightPressed = false;
             * }
             * }
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                if (PublicStuff.isRectSelected) {
                    PublicStuff.addRectangle(e.getX(), e.getY()); // Add a rectangle at the mouse position
                } else if (PublicStuff.isCircleSelected) {
                    PublicStuff.addCircle(e.getX(), e.getY()); // Add a circle at the mouse position
                }
            }
        });
    }
}
