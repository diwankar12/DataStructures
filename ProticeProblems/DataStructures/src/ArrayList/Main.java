package ArrayList;

import java.util.Scanner;

public class Main {

  // Create a program that implements a simple mobile phone with the following capabilities.
  // Able to store, modify, remove and query contact names.
  // You will want to create a separate class for Contacts (name and phone number).
  // Create a master class (MobilePhone) that holds the ArrayList of Contacts
  // The MobilePhone class has the functionality listed above.
  // Add a menu of options that are available.
  // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
  // and search/find contact.
  // When adding or updating be sure to check if the contact already exists (use name)
  // Be sure not to expose the inner workings of the Arraylist to MobilePhone
  // e.g. no ints, no .get(i) etc
  // MobilePhone should do everything with Contact objects only.
  //******DO with Contact Objects in the MobilePhone class

  private static Scanner scanner = new Scanner(System.in);
  private static MobilePhone mobilePhone = new MobilePhone();

  public static void main(String[] args) {

    int choice = 0;
    boolean quit = false;
    printMenu();

    while (!quit) {
      choice = scanner.nextInt();
      scanner.nextLine();
      switch (choice) {
        case 0:
          printMenu();
          break;
        case 1:
          showlist();
          break;
        case 2:
          addContact();
          break;
        case 3:
          updateContact();
          break;
        case 4:
          removeContact();
          break;
        case 5:
          searchContact();
          break;
        case 6:
          quit = true;
          break;
      }


    }


  }


  public static void printMenu() {

    System.out.println("\nPress ");
    System.out.println("\t 0 - To print choice options.");
    System.out.println("\t 1 - To print the list of contacts");
    System.out.println("\t 2 - To add an Contact in the list.");
    System.out.println("\t 3 - To modify an contact in the list.");
    System.out.println("\t 4 - To remove an Contact from the list.");
    System.out.println("\t 5 - To search for an Contact in the list.");
    System.out.println("\t 6 - To quit the application.");

  }

  public static void showlist() {

    System.out.println("Listing the Contacts");
    mobilePhone.listContacts();

  }

  public static void addContact() {

    System.out.println("Please type the name");
    String name = scanner.nextLine();
    System.out.println("Please type the number ");
    int number = scanner.nextInt();
    scanner.nextLine();
    mobilePhone.store(number, name);

  }

  public static void updateContact() {

    System.out.println("Please enter the name which has to be  updated : ");
    String name = scanner.nextLine();
    System.out.println("Please enter the new name : ");
    String newName = scanner.nextLine();
    mobilePhone.updateList(name, newName);


  }


  public static void searchContact() {

    System.out.println("Please enter the name to be searched : ");
    String name = scanner.nextLine();
    mobilePhone.searchName(name);

  }

  public static void removeContact() {

    System.out.println("Please enter the name to be removed : ");
    String name = scanner.nextLine();
    mobilePhone.removeName(name);


  }

}
