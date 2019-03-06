package GenricChallenge;

public class Team<T extends Tournaments> implements Comparable<Team<T>>{

  private String name ;
  int win ,lost ,tied =0 ;

  public Team(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }


  public void matchResult(int ourScore,int theirScore, Team<T> opponent){
   String message = " " ;
    if(ourScore > theirScore){
      win++ ;
      message = " win " ;
    }else if (ourScore == theirScore){
      tied ++ ;
      message = " tie " ;
    } else {

      lost++;
      message = " lost " ;
    }
    if(opponent != null) {
      System.out.println(this.getName() +  message  + opponent.getName());
      opponent.matchResult( theirScore, ourScore,null);
    }

  }

    public int ranking() {
      return (win * 2) + tied;
    }


  @Override
  public int compareTo(Team<T> team) {
    if(this.ranking() > team.ranking()) {
      return -1;
    } else if(this.ranking() < team.ranking()) {
      return 1;
    } else {
      return 0;
    }
  }





}
