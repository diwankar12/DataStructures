package Inheritance;

public class Vehicle {

  // Challenge.
  // Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
  // Finally, create another class, a specific type of Car that inherits from the Car class.
  // You should be able to hand steering, changing gears, and moving (speed in other words).
  // You will want to decide where to put the appropriate state and behaviours (fields and methods).
  // As mentioned above, changing gears, increasing/decreasing speed should be included.
  // For you specific type of vehicle you will want to add something specific for that type of car.

  private String type;
  private String name;

  private int currentDirection;
  private double currentVelocity;

  public Vehicle(String type, String name) {
    this.type = type;
    this.name = name;
    this.currentDirection = 0;
    this.currentVelocity = 0;
  }

  public void move(double increaseSpeed) {

    currentVelocity += increaseSpeed;
    System.out.println("Now Vehicle is moving with " + getCurrentVelocity());

  }

  public void steer(double speed, double direction) {

    currentVelocity += speed;
    currentDirection += direction;
    System.out.println("Now the vehicle is moving at " + getCurrentVelocity() + "in direction "
        + getCurrentDirection());

  }

  public void stop() {

    currentVelocity = 0;
    System.out.println("Vechile is stop : " + getCurrentVelocity());

  }

  public String getType() {
    return type;
  }

  public String getName() {
    return name;
  }

  public int getCurrentDirection() {
    return currentDirection;
  }

  public double getCurrentVelocity() {
    return currentVelocity;
  }
}
