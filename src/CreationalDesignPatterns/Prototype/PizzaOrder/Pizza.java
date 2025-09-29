package CreationalDesignPatterns.Prototype.PizzaOrder;

public class Pizza extends Meal{
    private PizzaFlavor flavor;
    public Pizza(int price, PizzaFlavor flavor) {
        super(price);
        this.flavor = flavor;
    }

    public PizzaFlavor getFlavor() {
        return flavor;
    }

    public void setFlavor(PizzaFlavor flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "price='" + getPrice() + '\'' +
                "flavor='" + flavor.getName() + '\'' +
                '}';
    }

    @Override
    public Pizza clone() {
        //deep clone
        return new Pizza(this.getPrice(), new PizzaFlavor(this.getFlavor().getName()));
    }
}
