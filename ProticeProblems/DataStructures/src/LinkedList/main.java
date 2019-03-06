package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class main {

  private static ArrayList<Album> album = new ArrayList<>();





  public static void main(String[] args) {

    Album album1 = new Album("album1", "artist1");
    album1.addSong("Stormbringer", 4.6);
    album1.addSong("Love don't mean a thing", 4.22);
    album1.addSong("Holy man", 4.3);
    album1.addSong("Hold on", 5.6);
    album1.addSong("Lady double dealer", 3.21);
    album1.addSong("You can't do it right", 6.23);
    album1.addSong("High ball shooter", 4.27);
    album1.addSong("The gypsy", 4.2);
    album1.addSong("Soldier of fortune", 3.13);

    album.add(album1);

    Album album2 = new Album("album2", "artist2");
    album2.addSong("For those about to rock", 5.44);
    album2.addSong("I put the finger on you", 3.25);
    album2.addSong("Lets go", 3.45);
    album2.addSong("Inject the venom", 3.33);
    album2.addSong("Snowballed", 4.51);
    album2.addSong("Evil walks", 3.45);
    album2.addSong("C.O.D.", 5.25);
    album2.addSong("Breaking the rules", 5.32);
    album2.addSong("Night of the long knives", 5.12);

    album.add(album2);
    LinkedList<Song> playList = new LinkedList<Song>();
    album.get(0).addPlaylist(playList,"You can't do it right");
    album.get(0).addPlaylist(playList,"Holy man");
    album.get(0).addPlaylist( playList,"Speed king");  // Does not exist
    album.get(0).addPlaylist( playList,9);
    album.get(1).addPlaylist(playList,8);
    album.get(1).addPlaylist(playList,3);
    album.get(1).addPlaylist(playList,2);
    album.get(1).addPlaylist(playList,24);
    play(playList);


  }

// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist

  public static void play(LinkedList<Song> linkedList) {
    ListIterator<Song> listIterator = linkedList.listIterator();
    Scanner scan = new Scanner(System.in);

    int choice = 0;
    boolean quit = false;
    boolean forward = true ;
    if(linkedList.isEmpty()){
      System.out.println("There is no song in the playlist");
      return ;

    } else {

      System.out.println("Now playing " +listIterator.next());
      printMenu();
    }

    while (!quit) {
      choice = scan.nextInt();
      scan.nextLine();
      switch (choice) {
        case 0:
          quit = true;
          break;
        case 1:
          if(!forward){
            if(listIterator.hasNext()){
              listIterator.next();

            }
            forward = true ;

          }
          if(listIterator.hasNext()) {
            System.out.println("Now playing " + listIterator.next().getTitle());
          } else {
            System.out.println("Reached the end of the playlist");
            forward = false ;
          }
          break;
        case 2:
          if(forward){
            if(listIterator.hasPrevious()){

              listIterator.previous();
            }
            forward = false ;
          }
          if(listIterator.hasPrevious())
          {
            System.out.println("Now playing " + listIterator.previous().getTitle());
          } else {

            System.out.println("Reached start of the playlist");
            forward = true ;
          }
          break;
        case 3:
          if(forward) {
            if(listIterator.hasPrevious()) {
              System.out.println("Now replaying " + listIterator.previous().toString());
              forward = false;
            } else {
              System.out.println("We are at the start of the list");
            }
          } else {
            if(listIterator.hasNext()) {
              System.out.println("Now replaying " + listIterator.next().toString());
              forward = true;
            } else {
              System.out.println("We have reached the end of the list");
            }
          }
          break;
        case 4:
          for(Song song : linkedList){
            System.out.println("List of all the songs in the playlist are : "+song.getTitle());

          }

          break;
        case 5:
          printMenu();
          break;
        case 6:
         if(!linkedList.isEmpty()){
           listIterator.remove();
           if(listIterator.hasNext()){

             System.out.println("Now playing "+listIterator.next());
           }else if(listIterator.hasPrevious()) {

             System.out.println("Now playing "+listIterator.previous());
           }

         }
          break;

      }


    }


  }


  private static void printMenu() {
    System.out.println("Available actions:\npress");
    System.out.println("0 - to quit\n" +
        "1 - to play next song\n" +
        "2 - to play previous song\n" +
        "3 - to replay the current song\n" +
        "4 - list songs in the playlist\n" +
        "5 - print available actions.\n" +
        "6 - delete current song from playlist");

  }


}
