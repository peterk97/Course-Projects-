package com.peterkoncz;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration){
        return songs.add(new Song(title,duration));
    }

    public boolean addToPlaylist(LinkedList<Song> playList, int trackNumber){
        Song song = this.songs.findSong(trackNumber);
        if (song != null){
            playList.add(song);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(LinkedList<Song> playList, String title){
       Song song = this.songs.findSong(title);
       if (song != null){
           playList.add(song);
           return true;
       }
            System.out.println("The song " + title + " is not in this album");
            return false;
    }

//    public void printSongs(){
//        for (Song s : songs.songs){
//            System.out.println(s);
//        }
//    }


//    SongList Inner class !
 private class SongList{
        private ArrayList<Song> songs;

     public SongList() {
         songs = new ArrayList<>();
     }

     public boolean add(Song song){
         if (findSong(song.getTitle()) != null){
             return false;
         }else {
             this.songs.add(song);
             return true;
         }
     }

     private Song findSong(String title){
         for (Song song : this.songs){
             if (song.getTitle().equals(title)){
                 return song;
             }
         }
         return null;
     }

     private Song findSong(int trackNumber){
            int index = trackNumber -1;
            if ((index >= 0) && index<songs.size()){
                return songs.get(index);
            }
            return null;
     }
 }



}


























