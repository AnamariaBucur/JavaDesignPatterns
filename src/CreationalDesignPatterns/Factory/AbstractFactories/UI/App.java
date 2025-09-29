package CreationalDesignPatterns.Factory.AbstractFactories.UI;

public class App {
    public static void main(String[] args) {

    }
    private static UserInterface createUserInterface(String color) {
        if (color.equalsIgnoreCase("RED")) {
            return new UserInterface(new RedButton(), new RedScrollBar());
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new UserInterface(new BlueButton(), new BlueScrollBar());
        } else {
            throw new IllegalArgumentException("Color not supported");
        }
    }
}
