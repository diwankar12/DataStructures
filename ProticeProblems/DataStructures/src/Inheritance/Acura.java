package Inheritance;

public class Acura extends Car {

  private int roadServicemonths;

  public Acura(int roadServicemonths) {
    super("sedan", "ILX", 4, 4, true, 4);
    this.roadServicemonths = roadServicemonths;
  }

  public void accelerate(int rate) {

    double newVelocity = getCurrentVelocity() + rate;
    if (newVelocity == 0) {
      changeGear(1);
      stop();
      System.out.println("The car is stopped ");

    } else if (newVelocity > 0 && newVelocity <= 10) {
      changeGear(1);
    } else if (newVelocity > 10 && newVelocity <= 20) {
      changeGear(2);
    } else if (newVelocity > 20 && newVelocity <= 30) {
      changeGear(3);
    } else {
      changeGear(4);
    }
    if (newVelocity > 0) {

      changeSpeed(newVelocity, getCurrentDirection());


    }

  }


}
