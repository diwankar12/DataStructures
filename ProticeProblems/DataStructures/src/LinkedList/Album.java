package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()


public class Album {

  LinkedList<String> playlist = new LinkedList<>();
  private String name;
  private String artist;
  private ArrayList<Song> songs;

  public Album(String name, String artist) {
    this.name = name;
    this.artist = artist;
    this.songs = new ArrayList<>();

  }

  public String getName() {
    return name;
  }

  public String getArtist() {
    return artist;
  }

  public boolean addSong(String title, double duration) {

    // Add specific song to playlist from songs
    if (findSong(title) == null) {
      this.songs.add(new Song(title, duration));
      return true;
    } else {
      return false;
    }
  }

  public Song findSong(String title) {
    // find song in the array list
    for (Song i : this.songs) {
      if (i.getTitle().equals(title)) {
        //System.out.println(i.toString());
        return i;
      }
    }
    return null;
  }

// Songs from different albums can be added to the playlist and will appear in the list in the order

  public boolean addPlaylist(LinkedList<Song> playlist, String title) {
    //check song if it there
    Song checkedSong = findSong(title);
    if (checkedSong != null) {
      playlist.add(checkedSong);
      return true;
    }
    System.out.println("The " + title + "is not found in the songs");
    return false;
  }


  public boolean addPlaylist(LinkedList<Song> playlist, Integer trackNumber) {

    int index = trackNumber - 1;

    if ((index >= 0) && (index < this.songs.size())) {
      playlist.add(this.songs.get(index));
      return true;
    }
    return false;
  }
}




