package CreationalDesignPatterns.Factory.AbstractFactories.UI;

public class BlueScrollBar implements ScrollBar{
    @Override
    public String getColor() {
        return "BLUE";
    }
}
