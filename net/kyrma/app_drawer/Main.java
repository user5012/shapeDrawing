import window.MyButtons;
import window.MyWindow;
import javax.swing.JButton;
import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        MyButtons button1 = new MyButtons("Button 1", 100, 50, 50, 50, () -> System.out.println("Button 1 clicked"));
        MyButtons button2 = new MyButtons("Button 2", 100, 50, 200, 50, () -> System.out.println("Button 2 clicked"));
        ArrayList<JButton> buttons = new ArrayList<>();
        buttons.add(button1.getButton());
        buttons.add(button2.getButton());

        MyWindow window = new MyWindow("My Application", 800, 600, buttons);
        window.ShowWindow();

    }
}