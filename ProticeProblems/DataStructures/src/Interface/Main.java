package Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Players player  = new Players("diwankar",1800,"tankmm");
       System.out.println(player.toString());
        saveObject(player);
        loadObject(player);

        System.out.println(player);
        player.setWeapon("Stormbringer");
        saveObject(player);
        loadObject(player);
        System.out.println(player);




    }


    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }





    public static void saveObject(Players ObjectToWrite){

        for(int i = 0; i < ObjectToWrite.write().size();i++){


            System.out.println("getting the value " + ObjectToWrite.write().get(i));


        }



    }


public static void loadObject(Players ObjecttoLoad){

    List<String> value = readValues();

        ObjecttoLoad.read(value);


}






}
