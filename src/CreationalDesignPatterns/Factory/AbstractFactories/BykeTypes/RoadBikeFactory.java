package CreationalDesignPatterns.Factory.AbstractFactories.BykeTypes;

public class RoadBikeFactory implements BikeFactory{
    @Override
    public HandleBars createHandlebars() {
        return new RoadBikeHandleBars();
    }

    @Override
    public Pedals createPedals() {
        return new RoadBikePedals();
    }

    @Override
    public Tire createTire() {
        return new RoadBikeTire();
    }

}
