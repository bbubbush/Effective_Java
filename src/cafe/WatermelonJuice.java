package cafe;

public class WatermelonJuice extends Juice {
    /* field */

    /* constructor */
    public WatermelonJuice() {
        setPrice(2500);
        setSize("L");
        setIsFruity(true);

    System.out.println("Watermelon juice price :: " + getPrice());
    System.out.println("Watermelon juice size :: " + getSize());
    System.out.println("Water melon juice is fruity :: " + getIsFruity());
    }
    /* method */
}
