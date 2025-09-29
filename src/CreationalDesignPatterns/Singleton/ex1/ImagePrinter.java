package CreationalDesignPatterns.Singleton.ex1;

public class ImagePrinter {
    public void printImage() {
        var spooler = PrintSpooler.getInstance();
        spooler.print();
    }
}
