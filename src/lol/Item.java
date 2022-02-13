package lol;

public class Item {
  /* field */
  private int price;

  /* constructor */
  public Item() {
    System.out.println("price :: " + price);
  }

  /* methods */
  public int getPrice() {
    return this.price;
  }

  public void setPrice(int newPrice) {
    this.price = newPrice;
  }
}
