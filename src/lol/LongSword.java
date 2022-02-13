package lol;

public class LongSword extends Weapon {
  /* field */

  /* constructor */
  public LongSword() {
    setPrice(350);
    setDamage(10);
    System.out.println("long sword price :: " + getPrice());
    System.out.println("long sword damage :: " + getDamage());
  }
  /* methods */
}
