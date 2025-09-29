package CreationalDesignPatterns.Singleton.ex2;

public class Dog {
    private final Logger logger = Logger.getInstance();

    public void woof() {
        logger.log("woof");

    }
}
