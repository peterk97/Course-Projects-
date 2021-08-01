package com.company;

import com.sun.security.jgss.GSSUtil;

import javax.lang.model.element.NestingKind;
import java.security.PrivateKey;
import java.util.*;
import java.util.jar.JarOutputStream;

public class Main {

     private static ArrayList<Album> albums = new ArrayList<Album>();
//   private static LinkedList<Song> playList = new LinkedList<Song>();
     private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        albums.add(new Album("Rock"));
        albums.add(new Album("Pop"));



        albums.get(0).add("marcell", "3.5");
        albums.get(0).add("peter", "3.9");
        albums.get(0).add("andras", "3.5");
        albums.get(0).add("dany", "3.5");
        albums.get(0).add("tim", "3.5");
        albums.get(0).add("locky", "3.5");
        //albums.get(0).print();



        albums.get(1).add("david","5,5");
        albums.get(1).add("jan","5,5");
        albums.get(1).add("polly","5,5");
        albums.get(1).add("harry","5,5");
        //albums.get(1).print();

        LinkedList<Song> playList = new LinkedList<Song>();

        addToPlaylist("marcell",playList);
        addToPlaylist("marci",playList);
        addToPlaylist("polly",playList);
        addToPlaylist("dany",playList);
        addToPlaylist("david",playList);
        addToPlaylist("locky",playList);
        addToPlaylist("peter",playList);
        //printPList(playList);

       playListOptions(playList);

    }

    private static void addSolution (LinkedList<Song> linkedList){
        String name = scanner.nextLine();
        addToPlaylist(name,linkedList);
    }


//playlistfunctions
    private static void playListOptions(LinkedList<Song> playList){
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<Song> listIterator = playList.listIterator();

            printMenu();

        while (!quit){
            System.out.print("Enter command: ");
            String action = scanner.nextLine();

            switch (action){
                case "q":
                    quit = true;
                    break;

                case "add":
                    System.out.print("Enter Song:");
                    String name = scanner.nextLine();
                    addToPlaylist(name,playList);

                    break;

                case "r":
                    if(playList.size() >0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().getName());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous().getName());
                        }
                    }
                    break;

                case "d":
                    if (!goingForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().getName());
                    }else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;

                case "u":
                    if (goingForward){//extra check !! because of the list iterator
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }

                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().getName());
                    }else {
                        System.out.println("We are at the start of the list!");
                        goingForward = true;
                    }
                    break;

                case "l":
                    printPList(playList);
                    break;


                case "pm":
                    printMenu();
            }
        }
    }




//print menu
private static void printMenu(){
    System.out.println("Available options:\npress ");
    System.out.println("q - to quit\n" +
            "add - add song\n" +
            "r - remove song\n" +
            "u - go up in the list\n" +
            "d - go down in the list\n" +
            "l - list songs\n" +
            "pm - print menu\n");
}



    //add to playlist
    public static boolean addToPlaylist (String name, LinkedList<Song> linkedList){
        if (checkAlbums(name) < 0) {
            System.out.println("Song Cannot find in albums");
            return false;
        }else if (findInPlay(linkedList,name)){
            System.out.println("Song is already on list");
            return false;
        }else if(checkAlbums(name) >= 0){
            Song song = new Song(albums.get(getAlbumsNum(name)).getSongs().get(checkAlbums(name)).getName(),albums.get(getAlbumsNum(name)).getSongs().get(checkAlbums(name)).getDuration());
            linkedList.add(song);
            System.out.println(name + ": Added to the playlist!");
            return true;
        }else{
            System.out.println("Cannot find song");
            return false;
        }
    }



    //Print play list
     public static void printPList (LinkedList<Song> linkedList) {
        Iterator<Song> i = linkedList.iterator();
         System.out.println("====================================");
        while (i.hasNext()){
            System.out.println(i.next().getNameDuration());
        }
         System.out.println("======================================");

     }

    // check in albums !
    public static int checkAlbums(String name) {
        for (int i = 0; i < albums.size(); i++) {
            if (albums.get(i).find(name) >= 0){
                return albums.get(i).find(name);
            }
        }
        return -1;
    }

//return albums num
    private static int getAlbumsNum(String name) {
        for (int i = 0; i < albums.size(); i++) {
            if (albums.get(i).find(name) >= 0){
                return i;
            }

        }
        return -1;
    }

    //look for songs on playlist
    public static boolean findInPlay (LinkedList<Song> linkedList, String name){
        ListIterator<Song> listIterator = linkedList.listIterator();

        while (listIterator.hasNext()){
            int compare = listIterator.next().getName().compareTo(name);

            if (compare == 0){
                return true;
            }
        }
        return false;
    }

}
