package com.peterkoncz;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration){
        if (findSong(title) == null){
            songs.add(new Song(title,duration));
            return true;
        }else {
            return false;
        }
    }

    private Song findSong(String title){
        for (Song song : songs){
            if (song.getTitle().equals(title)){
                return song;
            }
        }
        return null;
    }

    //fix this method
//    public boolean addToPlaylist(LinkedList<Song> playList, int trackNumber){
//        Song song = this.songs.findSong(trackNumber);
//        if (song != null){
//            playList.add(song);
//            return true;
//        }
//        System.out.println("This album does not have a track " + trackNumber);
//        return false;
//    }

    public boolean addToPlaylist(LinkedList<Song> linkedList, String title){
        if (findSong(title) != null){
            linkedList.add(findSong(title));
            return true;
        }else {
            System.out.println("The song " + title + " is not in this album");
            return false;
        }
    }

    public void printSongs(){
        for (Song s : songs){
            System.out.println(s);
        }
    }





}
