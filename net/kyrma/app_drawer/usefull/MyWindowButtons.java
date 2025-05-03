package usefull;

import window.MyButtons;

public class MyWindowButtons {

    public static MyButtons addCirlceBtn = new MyButtons("Add Cirlce", 100, 50, 100, 30, () -> {
        if (!PublicStuff.isCircleSelected) {
            PublicStuff.isCircleSelected = true; // Set the flag to true when the circle is selected
            PublicStuff.isRectSelected = false; // Set the flag to false when the rectangle is selected
        }
    }); // Add a button at (50, 50) with size (100, 30)

    public static MyButtons addRectangleBtn = new MyButtons("Add Rectangle", 100, 50, 100, 90, () -> {
        if (!PublicStuff.isRectSelected) {
            PublicStuff.isCircleSelected = false; // Set the flag to false when the rectangle is selected
            PublicStuff.isRectSelected = true; // Set the flag to true when the rectangle is selected
        }
    }); // Add a button at (50, 90) with size (100, 30)

    public void addButtons() {
        PublicStuff.addButton(addCirlceBtn.getButton()); // Add the circle button to the list
        PublicStuff.addButton(addRectangleBtn.getButton()); // Add the rectangle button to the list
    }
}
