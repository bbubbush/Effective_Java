package cafe;

public class Drink extends Item {
  /* field */
  public String size;

  /* constructor */
  public Drink() {

  }

  /* method */
  public String getSize() {

    return this.size;
  }

  public void setSize(String newSize) {
    this.size = newSize;
    if (this.size.equals("M")) {
      setPrice(getPrice() + 500);
    }
    if (this.size.equals("L")) {
      setPrice(getPrice() + 1000);
    }
  }
}
