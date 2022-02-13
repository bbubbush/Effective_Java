package cafe;

public class Latte extends Coffee {
  /* field */
  private Milk milk;

  /* constructor */
  public Latte() {
    this.milk = new SoyMilk();
    int addPrice = milk.addPrice();
    setPrice(4000 + addPrice);
    setSize("M");
    setEspressoShot(3);
    setWaterAmount(1);
    setContainsMilk(true);

    System.out.println("Latte price :: " + getPrice());
    System.out.println("Latte size :: " + getSize());
    System.out.println("Latte has espresso :: " + getEspressoShot());
    System.out.println("Latte has water :: " + getWaterAmount());
    System.out.println("Latte has milk :: " + getContainsMilk());
  }
  /* method */

}
