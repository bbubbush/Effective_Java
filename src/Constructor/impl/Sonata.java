package Constructor.impl;

public class Sonata implements Car {
  @Override
  public String getModel() {
    return "This is sonata";
  }

  @Override
  public int getPrice() {
    return 3_000_000;
  }
}