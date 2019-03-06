package Composition;

public class Wall {

  private int breadth ;
  private int width ;
  private int depth ;

  public Wall(int breadth, int width, int depth) {
    this.breadth = breadth;
    this.width = width;
    this.depth = depth;
  }

  public int getBreadth() {
    return breadth;
  }

  public int getWidth() {
    return width;
  }

  public int getDepth() {
    return depth;
  }
}
