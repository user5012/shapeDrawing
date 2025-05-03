import window.MyMouseHandler;
import window.MyWindow;
import usefull.MyWindowButtons;
import usefull.PublicStuff;

class Main {

    public static void main(String[] args) {

        final MyWindow[] windowHolder = new MyWindow[1]; // Array to hold the window reference
        windowHolder[0] = PublicStuff.window; // Initialize the window reference
        final MyWindowButtons windowButtons = new MyWindowButtons(); // Create an instance of MyWindowButtons
        windowButtons.addButtons(); // Add buttons to the window

        PublicStuff.window = new MyWindow(PublicStuff.TITLE, PublicStuff.WIDTH, PublicStuff.HEIGHT, PublicStuff.buttons,
                PublicStuff.circles, PublicStuff.rectangles); // creates window

        PublicStuff.frame = PublicStuff.window.getFrame(); // Set the frame reference in PublicStuff

        PublicStuff.window.ShowWindow();

        MyMouseHandler.getClicks(); // Start the mouse handler loop

        while (true) {
            try {
                Thread.sleep(100); // Sleep for a short duration to avoid busy waiting
            } catch (InterruptedException e) {
                e.printStackTrace(); // Handle the exception
            }
            MyMouseHandler.getClicks(); // Call the mouse handler to check for clicks

        }
    }
}