package CreationalDesignPatterns.Factory.AbstractFactories.BykeTypes;

public class MountainBikeHandleBars implements HandleBars{
    @Override
    public String getType() {
        return "FLAT";
    }
}
