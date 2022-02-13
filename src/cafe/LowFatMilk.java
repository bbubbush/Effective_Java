package cafe;

public class LowFatMilk extends Milk {
    // constructor
    public LowFatMilk() {
    System.out.println("Milk type :: Low fat milk");
    }
    // method
    @Override
    public int addPrice() {
        return 500;
    }
}
