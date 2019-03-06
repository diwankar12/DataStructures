package Composition;

public class Ceiling {

  private String color ;
  private int length ;
  private int width ;

  public Ceiling(String color, int length, int width) {
    this.color = color;
    this.length = length;
    this.width = width;
  }

  public String getColor() {
    return color;
  }

  public int getLength() {
    return length;
  }

  public int getWidth() {
    return width;
  }
}
