package cafe;

public class Americano extends Coffee {
  /* field */
  public boolean containsWater;

  /* constructor */
  public Americano() {
    setPrice(3000);
    setSize("M");
    setEspressoShot(2);
    setWaterAmount(1);
    setContainsMilk(false);

    System.out.println("Americano price :: " + getPrice());
    System.out.println("Americano size :: " + getSize());
    System.out.println("Americano has espresso :: " + getEspressoShot());
    System.out.println("Americano has water :: " + getWaterAmount());
    System.out.println("Americano has milk :: " + getContainsMilk());
  }

  /* method */

}
