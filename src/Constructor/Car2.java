package Constructor;

public class Car2 {
  // fields
  private int year = 2013;
  private String make;
  private String model;
  private String color;
  private String vehicleIdNo;

  // constructor
  private Car2(int year, String make, String model, String color, String vehicleIdNo) {
    this.year = year;
    this.make = make;
    this.model = model;
    this.color = color;
    this.vehicleIdNo = vehicleIdNo;
  }

  public static Car2 getCar2(
      int year, String make, String model, String color, String vehicleIdNo) {
    return new Car2(year, make, model, color, vehicleIdNo);
  }

  public static Car2 getMinsCar() {
    return new Car2(2013, "Toyota", "Corolla", "grey", "1x2y3zABC");
  }


  // getter and setter methods
  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getVehicleIdNo() {
    return vehicleIdNo;
  }

  public void setVehicleIdNo(String vehicleIdNo) {
    this.vehicleIdNo = vehicleIdNo;
  }
}
