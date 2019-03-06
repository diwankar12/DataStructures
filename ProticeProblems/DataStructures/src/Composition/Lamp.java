package Composition;

public class Lamp {

private String style ;
private String color ;

  public Lamp(String style, String color) {
    this.style = style;
    this.color = color;
  }

  public String getStyle() {
    return style;
  }

  public String getColor() {
    return color;
  }

  public void turnOn (){

    System.out.println("Lamp is turned on ");
  }
}
