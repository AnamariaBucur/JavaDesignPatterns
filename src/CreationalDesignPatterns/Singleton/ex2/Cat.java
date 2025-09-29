package CreationalDesignPatterns.Singleton.ex2;

public class Cat {
    private final Logger logger = Logger.getInstance();

    public void meow() {
        logger.log("Meow");
    }
}
