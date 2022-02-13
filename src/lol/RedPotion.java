package lol;

public class RedPotion extends Potion {

  public RedPotion() {
    setPrice(50);

    setRestored_Health(150);

    System.out.println("red potion price :: " + getPrice());
    System.out.println("red potion restored health :: " + getRestored_Health());
  }
}
