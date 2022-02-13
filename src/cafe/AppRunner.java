package cafe;

public class AppRunner {
  public static void main(String[] args) {
    Americano americano = new Americano();
    System.out.println();

    Latte latte = new Latte();
    System.out.println();

    WatermelonJuice watermelonJuice = new WatermelonJuice();
    System.out.println();

    OrangeSparkling orangeSparkling = new OrangeSparkling();
    System.out.println();

    CheeseCake cheeseCake = new CheeseCake();
    System.out.println();

    int sum = 0;
    sum =
        americano.getPrice()
            + latte.getPrice()
            + watermelonJuice.getPrice()
            + orangeSparkling.getPrice()
            + cheeseCake.getPrice();
    System.out.println("Total price :: " + sum);
  }
}
