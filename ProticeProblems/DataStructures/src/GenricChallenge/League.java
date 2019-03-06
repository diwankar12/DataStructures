package GenricChallenge;


import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

  private String name ;
  private ArrayList<T> league = new ArrayList<>();



 League(String name) {
    this.name = name;

  }

 String getName() {
    return name;
  }


  public boolean addTeam(T team){

   if(league.contains(team.getName())){

     System.out.println("Team is already added in the league");
     return false ;
   } else {

     league.add(team);
     System.out.println("Added " +team.getName() + "in the list ");
     return true ;
   }


  }

  public void showLeagueTable(){
    Collections.sort(league);
    for(T t : league) {
      System.out.println(t.getName() + ": " + t.ranking());
    }
  }
}
