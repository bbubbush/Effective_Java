package cafe;

public class CheeseCake extends Cake {
  /* field */

  /* constructor */
  public CheeseCake() {
    setPrice(4500);
    setIsFood(true);
    setIsFlour(true);

    System.out.println("Cheese cake price :: " + getPrice());
    System.out.println("Cheese cake is a food :: " + getIsFood());
    System.out.println("Cheese cake has flour :: " + getIsFlour());
  }

  /* method */
}
