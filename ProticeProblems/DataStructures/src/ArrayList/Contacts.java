package ArrayList;

public class Contacts {


  private String name;
  private int phNumber;

  public Contacts(String name, int phNumber) {
    this.name = name;
    this.phNumber = phNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPhNumber() {
    return phNumber;
  }

  public void setPhNumber(int phNumber) {
    this.phNumber = phNumber;
  }

  @Override
  public String toString() {
    return "Contacts{" +
        "name='" + name + '\'' +
        ", phNumber='" + phNumber + '\'' +
        '}';
  }
}
