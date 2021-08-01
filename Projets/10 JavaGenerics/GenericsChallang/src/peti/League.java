package peti;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class League<T extends Team>{
    private String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

//.print
    public void print (){
        System.out.println("Teams on the League list:");
        for (T team : league){
            System.out.println("[" + team.getName() + "]");
        }
    }

//.add
    public boolean addTeam (T team){
        if (league.contains(team)){
            System.out.println("[" + team.getName() + "]" + " is already on list");
            return false;
        }else{
            league.add(team);
            System.out.println("[" + team.getName() + "]" + " added to " + this.name + " league");
            return true;
        }
    }
//.match 2 teams from same type
    public void matchTeams (T home, T opponent, int homeScore, int opponentScore){
        if (homeScore > opponentScore){
            home.setWon( + 1 );
            opponent.setLost( + 1 );
        }else if (homeScore == opponentScore){
            home.setTied( + 1 );
            opponent.setTied( + 1 );
        }else {
            home.setLost( + 1 );
            opponent.setWon( + 1 );
        }
    }
//.count teams rank points based on lost won tied
    public int countRank (T team){
        int sumPoints = 0;
        sumPoints = (team.getWon() * 2) + (team.getTied()) - (team.getLost());
        return sumPoints;
    }


    public void printRank(){
        Collections.sort(league, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return Integer.compare(countRank(o2), countRank(o1));
            }
        });
        System.out.println("===============================");
        System.out.println(this.name + " League Rank Table:");
        int i = 0;
        for (T team : league){
            i++;
            System.out.println(i + "["+team.getName()+"]" + "<" + countRank(team) + ">");
        }
        System.out.println("===============================");
    }



}
