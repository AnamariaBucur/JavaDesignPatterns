package CreationalDesignPatterns.Factory.AbstractFactories.BykeTypes;

public class MountainBikePedals implements Pedals{
    @Override
    public String getType() {
        return "SPD";
    }
}
