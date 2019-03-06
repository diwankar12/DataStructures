package GenricChallenge;

public class Main {


  // Create a generic class to implement a league table for a sport.
  // The class should allow teams to be added to the list, and store
  // a list of teams that belong to the league.
  //
  // Your class should have a method to print out the teams in order,
  // with the team at the top of the league printed first.
  //
  // Only teams of the same type should be added to any particular
  // instance of the league class - the program should fail to compile
  // if an attempt is made to add an incompatible team.

    // breaking down requirements
    public static void main(String[] args) {

       League<Team<Asian>> ipl = new League("ipl");
       Team<Asian> mi = new Team("mi");
       Team<Asian> csk = new Team<>("csk");
       Team<Australian> ss = new Team<>("ss");
       ipl.addTeam(mi);
       ipl.addTeam(csk);
       League<Team<Australian>> bigBash = new League<>("bigBash");
       bigBash.addTeam(ss);



       // Asia ---> two teams
       // Australia --> one team
      mi.matchResult( 1, 0,csk);
      csk.matchResult( 3, 8,mi);
      ipl.showLeagueTable();
      bigBash.showLeagueTable();






    }







}
