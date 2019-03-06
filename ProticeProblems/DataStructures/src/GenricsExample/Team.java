package GenricsExample;

import java.util.ArrayList;

public class Team {

    private String name ;
    int won = 0 ;
    int loss = 0;
    int tied = 0 ;


    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    ArrayList<Player> members = new ArrayList<>();

    public boolean addplayer(Player player){

        if(members.contains(player.getName())){

            return false ;
        } else {
               members.add(player);
            System.out.println("Player added to " + player.getName() + " to the team" + this.name);
            return true ;

        }


    }

    public int numPlayer(){

        return this.members.size();

    }

   public void matchResult(Team opponent , int ourScore,int theirScore){

      if(ourScore > theirScore){

          won ++ ;
      }else if (ourScore == theirScore){
          tied ++ ;
      }else {

          loss++;
      }


   }


}
