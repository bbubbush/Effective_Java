package lol;

public class Potion extends Item {
  /* field */
  private int restored_Health;

  /* constructor */
  public Potion() {
    System.out.println("restored health :: " + restored_Health);
  }

  /* methods */

  public int getRestored_Health() {
    return restored_Health;
  }

  public void setRestored_Health(int newRestored_Health) {
    this.restored_Health = newRestored_Health;
  }
}
