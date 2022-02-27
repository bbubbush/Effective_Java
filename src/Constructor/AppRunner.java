package Constructor;

public class AppRunner {
  public static void main(String[] args) {
    Car car1 = new Car(2022, "Porsche", "911", "red", "9a8b7cXYZ");
    System.out.println("car year :: " + car1.getYear());
    System.out.println("car make :: " + car1.getMake());
    System.out.println("car model :: " + car1.getModel());
    System.out.println("car color :: " + car1.getColor());
    System.out.println("car vehicle ID No. :: " + car1.getVehicleIdNo() + "\n");

    Car2 car2 = Car2.getCar2(1970, "Ford", "Shelby", "yellow", "abcSEXY123");
    System.out.println("car2 year :: " + car2.getYear());
    System.out.println("car2 make :: " + car2.getMake());
    System.out.println("car2 model :: " + car2.getModel());
    System.out.println("car2 color :: " + car2.getColor());
    System.out.println("car2 vehicle ID No. :: " + car2.getVehicleIdNo() + "\n");

    Car2 minsCar = Car2.getMinsCar();
    System.out.println("minsCar year :: " + minsCar.getYear());
    System.out.println("minsCar make :: " + minsCar.getMake());
    System.out.println("minsCar model :: " + minsCar.getModel());
    System.out.println("minsCar color :: " + minsCar.getColor());
    System.out.println("minsCar vehicle ID No. :: " + minsCar.getVehicleIdNo() + "\n");
  }
}
