package Encapsulation;

public class Printer {

  // Create a class and demonstate proper encapsulation techniques
  // the class will be called Printer
  // It will simulate a real Computer Printer
  // It should have fields for the toner Level, number of pages printed, and
  // also whether its a duplex printer (capable of printing on both sides of the paper).
  // Add methods to fill up the toner (up to a maximum of 100%), another method to
  // simulate printing a page (which should increase the number of pages printed).
  // Decide on the scope, whether to use constructors, and anything else you think is needed.

  private int tonerLevel;
  private int numberOfPagesPrinted;
  private boolean isDuplexPrinter;

  public Printer(int tonerLevel, int numberOfPagesPrinted, boolean isDuplexPrinter) {
    if(tonerLevel >-1 && tonerLevel <=100) {
      this.tonerLevel = tonerLevel;
    } else {
      this.tonerLevel = -1;
    }

    this.tonerLevel = tonerLevel;
    this.numberOfPagesPrinted = 0;
    this.isDuplexPrinter = isDuplexPrinter;
  }


  public int fillupToner(int tonerAmount){

    if(tonerAmount >0 && tonerAmount <=100) {
      if(this.tonerLevel + tonerAmount >100) {
        return -1;
      }
      this.tonerLevel += tonerAmount;
      return this.tonerLevel;
    } else {
      return -1;
    }
  }

  public void print(){





  }

  public int getTonerLevel() {
    return tonerLevel;
  }

  public int getNumberOfPagesPrinted() {
    return numberOfPagesPrinted;
  }

  public boolean isDuplexPrinter() {
    return isDuplexPrinter;
  }
}
