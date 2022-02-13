package lol;

public class Weapon extends Item {
  /* field */
  private int damage;

  /* constructor */
  public Weapon() {
    System.out.println("damage :: " + damage);
  }

  /* methods */
  public int getDamage() {
    return this.damage;
  }

  public void setDamage(int newDamage) {
    this.damage = newDamage;
  }
}
