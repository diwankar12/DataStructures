package Composition;

public class Main {

  public static void main(String[] args) {

    Bed bed = new Bed("cot", new Theframe(10, 15), "spring");

    Bedroom bedroom =
        new
            Bedroom(bed, new Wall(10, 15, 20),
            new Ceiling("Red", 15, 10),
            new Lamp("Noraml", "Yellow"));

    bedroom.getLamp().turnOn();
    bedroom.make();

  }






}
