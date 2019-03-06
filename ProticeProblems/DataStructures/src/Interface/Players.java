package Interface;

import java.util.ArrayList;
import java.util.List;

public class Players implements Isaveable {


    // Create a simple interface (tip: name it Saveable or ISaveable)
// That interface allows an object to be saved to some sort of storage medium. (tip: use arraylist)
// The exact type of medium is not known to the interface (nor to the classes that implement it).
// The interface will just specify two methods, one to return an ArrayList of values to be saved
// and the other to populate the object's fields from an ArrayList (parameter).
//
// Create a few sample classes that implement your Saveable interface (we've used the idea of a game,
// with Players and Monsters, but you can create any type of classes that you want).
//
// Override the toString() method for each of your classes so that they can be easily printed to enable
// the program to be tested easier.
//
// In Main, write a method that takes an object that implements the interface as a parameter and
// "saves" the values e.g. calls the method defined in the interface.

// We haven't covered I/O yet, so your method should just print the values to the screen.
// Also in the Main class, write a method that restores the values to a Saveable object
// e.g. calls the method from the interface for populating fields (see above).

// Again, we are not going to use Java file I/O; instead use the readValues() method below to
// simulate getting values from a file – this allows you to type as many values as your class
// requires, and returns an ArrayList.
// There is a whole Java I/O section later in the course where you will get to use files, etc.

    private String name ;
    private Integer Health ;
    private String weapon ;


    public Players(String name, Integer health, String weapon) {
        this.name = name;
        Health = health;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public Integer getHealth() {
        return Health;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(Integer health) {
        Health = health;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public List<String> write() {
        List<String> getList = new ArrayList<>();
        getList.add(0,this.name);
        getList.add(1,"" + this.Health);
        getList.add(2,this.weapon);

        return getList;
    }

    @Override
    public void read(List<String> savedlists) {


        this.name =savedlists.get(0);
        this.Health = Integer.parseInt(savedlists.get(1));
        this.weapon = savedlists.get(2);



    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", Health=" + Health +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
