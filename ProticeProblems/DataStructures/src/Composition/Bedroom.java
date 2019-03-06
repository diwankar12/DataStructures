package Composition;

public class Bedroom {


  // Create a single room of a house using composition.
  // Think about the things that should be included in the room.
  // Maybe physical parts of the house but furniture as well
  // Add at least one method to access an object via a getter and
  // then that objects public method as you saw in the previous video
  // then add at least one method to hide the object e.g. not using a getter
  // but to access the object used in composition within the main class
  // like you saw in this video.

  private Bed bed ;
  private Wall wall ;
  private Ceiling ceiling ;
  private Lamp lamp ;

  public Bedroom(Bed bed, Wall wall, Ceiling ceiling, Lamp lamp) {
    this.bed = bed;
    this.wall = wall;
    this.ceiling = ceiling;
    this.lamp = lamp;
  }

  public Bed getBed() {
    return bed;
  }

  public void make() {
    System.out.println("Bedroom -> Making");
    bed.make();
  }


  public Wall getWall() {
    return wall;
  }

  public Ceiling getCeiling() {
    return ceiling;
  }

  public Lamp getLamp() {
    return lamp;
  }
}
