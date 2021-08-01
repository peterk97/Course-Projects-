package com.peterkoncz;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("The gypsy", 4.2);
        album.addSong("High ball shooter", 4.27);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlaylist(playList,"Stormbringer");
        albums.get(0).addToPlaylist(playList,"Holy man");
        albums.get(0).addToPlaylist(playList,"Hold on");
        albums.get(0).addToPlaylist(playList,"High ball shooter");
        albums.get(1).addToPlaylist(playList,"For those about to rock");
        albums.get(1).addToPlaylist(playList,"I put the finger on you");
        albums.get(1).addToPlaylist(playList,"Night of the long knives");
        albums.get(1).addToPlaylist(playList,"C.O.D");


    play(playList);



    }
    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if (playList.isEmpty()){
            System.out.println("No songs on this Playlist.");
            return;
        }else {
            System.out.println("Now playing " + listIterator.next());
            printMenu();

        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                case 1:
                    if (!forward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now playing: " + listIterator.next());
                    }else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing: " + listIterator.previous());
                    }else {
                        System.out.println("We are at the start of the playlist.");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            forward = false;
                            System.out.println("Now replaying: " + listIterator.previous());
                        } else {
                            System.out.println("We are at the start of the playlist.");
                        }
                    }else {
                        if (listIterator.hasNext()){
                            System.out.println("Now replaying: " + listIterator.next());
                            forward = true;
                        }else {
                            System.out.println("We have reached the end of the playlist");
                        }
                    }
                    break;
                case 4:
                    printPlaylist(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0){
                        listIterator.remove();
                        if (listIterator.hasNext()){
                            System.out.println("Now playing: " + listIterator.next());
                        }else if (listIterator.hasPrevious()){
                            System.out.println("Now playing: " + listIterator.previous());
                        }
                    }
                    break;
            }
        }

    }


    public static void printPlaylist(LinkedList<Song> list){
        Iterator<Song> iterator = list.iterator();
        System.out.println("================================");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("================================");
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
