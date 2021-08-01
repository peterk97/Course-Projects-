package peti;

public class Main {

    public static void main(String[] args) {

      //.league
        League<Football> footballLeague = new League<>("Football");
        League<Basketball> basketballLeague = new League<>("Basketball");

        //teams
        Football redRoosters = new Football("Red Roosters");
        Football rabbitos = new Football("Rabbitos");
        Football mrcell = new Football("Marcll");
        Football peter = new Football("Peter");

        Basketball ballKings = new Basketball("Ball Kings");
        Basketball basketMasters = new Basketball("Basket Masters");
        Basketball dunkGods = new Basketball("Dunk Gods");


        footballLeague.addTeam(redRoosters);
        footballLeague.addTeam(mrcell);
        footballLeague.addTeam(peter);
        footballLeague.addTeam(rabbitos);
        footballLeague.print();


        basketballLeague.addTeam(ballKings);
        basketballLeague.addTeam(dunkGods);
        basketballLeague.addTeam(basketMasters);


        footballLeague.matchTeams(mrcell,redRoosters,3,1);
        footballLeague.matchTeams(redRoosters,rabbitos,1,2);
        footballLeague.matchTeams(mrcell,peter,3,2);
        footballLeague.matchTeams(peter,redRoosters,5,3);

        basketballLeague.matchTeams(dunkGods,ballKings,3,4);
        basketballLeague.matchTeams(dunkGods,basketMasters,4,6);
        basketballLeague.matchTeams(basketMasters,ballKings,4,2);


        footballLeague.printRank();

        basketballLeague.printRank();







    }

    
}
