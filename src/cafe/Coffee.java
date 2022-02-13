package cafe;

public class Coffee extends Drink {
  /* field */
  private int espressoShot;
  private int waterAmount;
  private boolean containsMilk;

  /* constructor */
  public Coffee() {

  }

  /* method */
  public int getEspressoShot() {
    return this.espressoShot;
  }

  public void setEspressoShot(int newEspressoShot) {
    setPrice(getPrice() + (newEspressoShot - 1) * 500);
    this.espressoShot = newEspressoShot;
  }

  public int getWaterAmount() {
    return this.waterAmount;
  }

  public void setWaterAmount(int newWaterAmount) {
    this.waterAmount = newWaterAmount;
  }

  public boolean getContainsMilk() {
    return this.containsMilk;
  }

  public void setContainsMilk(boolean newContainsMilk) {
    this.containsMilk = newContainsMilk;
  }

}
