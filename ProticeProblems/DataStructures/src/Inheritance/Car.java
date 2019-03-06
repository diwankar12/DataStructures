package Inheritance;

public class Car extends Vehicle {

  private int wheels;
  private int doors;
  private boolean isManual;
  private int gears;

  private int currentGear;


  public Car(String type, String name, int wheels, int doors, boolean isManual, int gears) {
    super(type, name);
    this.wheels = wheels;
    this.doors = doors;
    this.isManual = isManual;
    this.gears = gears;
    this.currentGear = 1;
  }


  public void changeGear(int gear) {

    this.currentGear = gear;
    System.out.println("Car changed gear to " + this.currentGear);


  }


  public void changeSpeed(double speed, int direction) {

    System.out.println("Velocity " + speed + " direction " + direction);
    move(speed);

  }


}
