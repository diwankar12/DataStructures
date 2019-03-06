package ArrayList;

import java.util.ArrayList;

public class MobilePhone {


  ArrayList<Contacts> contactsArrayList = new ArrayList<>();
  // Able to store, modify, remove and query contact names.

  public void store(int number, String name) {

    // search if the number is not in arraylist
    if (contactsArrayList.contains(number)) {

      System.out.println("Contacts has already been added");

    } else {
      contactsArrayList.add(new Contacts(name, number));
      System.out.println("Contact is stored with name " + name + " and number " + number);
    }

  }

  public void listContacts() {

    for (int i = 0; i < contactsArrayList.size(); i++) {
      System.out.println(contactsArrayList.get(i));
    }

  }


  public void searchName(String name) {
    if (find(name) != -1) {
      System.out.println(name + " is already in the contact list");
      System.out.println(
          "Phone number is for " + name + " is :" + contactsArrayList.get(find(name))
              .getPhNumber());

    } else {

      System.out.println("Not found on the list");
    }


  }

  private int find(String name) {

    for (int i = 0; i < contactsArrayList.size(); i++) {

      if (contactsArrayList.get(i).getName().equals(name)) {

        return i;
      }


    }
    return -1;

  }

  public void updateList(String name, String newName) {

    if (find(name) != -1) {
      contactsArrayList.get(find(name)).setName(newName);
      System.out.println("Contacts is updated ");

    } else {
      System.out.println("Contact is not on the list");

    }


  }

  public void removeName(String name) {

    if (find(name) != -1) {

      contactsArrayList.remove(find(name));
      System.out.println("Removed the contact");

    } else {

      System.out.println("Not fount the contact");
    }


  }


}
