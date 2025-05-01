package window;

import javax.swing.JButton;

public class MyButtons {
    String name;
    int width;
    int height;
    int x;
    int y;
    Runnable action;
    private JButton button;

    private void craftBtn() {
        button = new JButton(name);
        button.setBounds(x, y, width, height);
        button.addActionListener(e -> action.run());

    }

    public MyButtons(String name, int bwidth, int bheight, int x, int y, Runnable action) {
        this.name = name;
        this.width = bwidth;
        this.height = bheight;
        this.x = x;
        this.y = y;
        this.action = action;

        craftBtn();
    }

    public JButton getButton() {
        return button;
    }
}
