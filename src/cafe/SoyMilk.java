package cafe;

public class SoyMilk extends Milk {
    // constructor
    public SoyMilk () {
    System.out.println("Milk type :: Soy milk");
    }

    // method
    @Override
    public int addPrice() {
        return 300;
    }
}
