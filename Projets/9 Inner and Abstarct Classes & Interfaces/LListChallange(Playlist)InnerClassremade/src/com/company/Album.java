package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    //private ArrayList<Song> songs;
    private SongList songs;

    public Album(String name) {
        this.name = name;
        this.songs = new SongList();
    }

    public String getName() {
        return name;
    }

    public SongList getSongs() {
        return songs;
    }

  public boolean addSong (String name, String duration){
        return  this.songs.add(new Song(name, duration));
  }


  public boolean addToPlaylist(String name, LinkedList<Song> playlist){
        Song checkedSong = songs.find(name);
        if (checkedSong!=null){
            playlist.add(checkedSong);
            System.out.println("[" +  name + "]: added to the Play list!");
            return true;
        }

      System.out.println("The song " + name + " is not in this album");
      return false;
  }

    //Add method
//    public boolean add (String name, String duration){
//        if (find(name)<0) {
//            songs.add(new Song(name, duration));
//            return true;
//        }else {
//            return false;
//        }
//    }

    //Remove
    public boolean remove (String name){
        if (find(name) >= 0){
            songs.songList.remove(songs.songList.get(find(name)));
            return true;
        }
      return false;
    }

    //check if exist
    public boolean exist (String name){
        if (find(name) >= 0){
            return true;
        }else {
            return false;
        }
    }

    //find
    public int find (String name){
       for (int i = 0; i<songs.songList.size(); i++){
           if (name.equals(songs.songList.get(i).getName())){
               return i;
           }
       }
       return -1;
    }

//    public Song findObject (String name){
//        for (int i = 0;i<songs.size(); i++){
//            Song checkedS = songs.get(i);
//            if (checkedS.getName().equals(name)){
//                return checkedS;
//            }
//        }
//        return null;
//    }

    //print
    public void print (){
        System.out.println("======================================");
        for (int i = 0 ;i<songs.songList.size();i++){
            System.out.println("Name: [" + songs.songList.get(i).getName() + "]\n" +
                    "Duration: [" + songs.songList.get(i).getDuration() + "]\n" +
                     "-------------------------");
        }
        System.out.println("======================================");
    }


    //INNER CLASS !!!

    public class SongList {
        private ArrayList<Song> songList;
//constructor
        public SongList() {
            this.songList = new ArrayList<Song>();
        }

        public ArrayList<Song> getSongList() {
            return songList;
        }

        //add method
        public boolean add (Song song){
            if (songList.contains(song)){
                return false;
            }else {
                songList.add(song);
                return true;
            }
        }

//find method
        public Song find (String name){
            for (Song song : songList) {
                if (song.getName().equals(name)) {
                    return song;
                }
            }
            return null;
        }




        public int find1 (String name){
            for (int i =0; i < songList.size();i++) {
                if (songList.get(i).getName().equals(name)) {
                    return i;
                }

            }
            return -1;
        }



    }






    

}
