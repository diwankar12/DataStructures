package Composition;

public class Bed {

  private String cot ;
  private Theframe frame ;
  private String matrices ;

  public Bed(String cot, Theframe frame, String matrices) {
    this.cot = cot;
    this.frame = frame;
    this.matrices = matrices;
  }


  public void make() {
    System.out.println("Bed -> Making");
  }


  public String getCot() {
    return cot;
  }

  public Theframe getFrame() {
    return frame;
  }

  public String getMatrices() {
    return matrices;
  }
}
