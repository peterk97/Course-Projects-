package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * This project is dealing with java generics in a bit higher lvl
 * we are going to create our own generic classes
 * what we are going to use for this example is to adding players
 * to various types of sporting teams
 */
public class Main {

    public static void main(String[] args) {
	// we have to cast to which player con go to which team so a football player only can be added
        //to a football team
        //

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows"); //init what kind of team is it going to be
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);  //becomes an error
//        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

//     Team<String> brokenteam = new Team<>("No one"); // because of the <T extends Player> this cannot be possible
//     brokenteam.addPlayer("marci");                  //other wise this could be an exception if we just use <T> cannot pass a String

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago Cubs");
        baseballPlayerTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("This is won't work");
        soccerPlayerTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");


        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(adelaideCrows,3,8);

        adelaideCrows.matchResult(fremantle,2,1);
        //adelaideCrows.matchResult(baseballPlayerTeam,1,1); //we also have to make sure only the correct team type can play

//print the rankings
        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking() );
        System.out.println(melbourne.getName() + ": " + melbourne.ranking() );
        System.out.println(fremantle.getName() + ": " + fremantle.ranking() );
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking() );


//rankings
        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));

//with an ArrayList it is would be something like :
//        ArrayList<Team> teams;
//        Collections.sort(teams);







    }
}
