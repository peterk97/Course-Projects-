package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<Song>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    //Add method
    public boolean add (String name, String duration){
        if (find(name)<0) {
            songs.add(new Song(name, duration));
            return true;
        }else {
            return false;
        }
    }

    //Remove
    public boolean remove (String name){
        if (find(name) >= 0){
            songs.remove(songs.get(find(name)));
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
       for (int i = 0; i<songs.size();i++){
           if (name.equals(songs.get(i).getName())){
               return i;
           }
       }
       return -1;
    }

    public Song findObject (String name){
        for (int i = 0;i<songs.size(); i++){
            Song checkedS = songs.get(i);
            if (checkedS.getName().equals(name)){
                return checkedS;
            }
        }
        return null;
    }

    //print
    public void print (){
        for (int i = 0 ;i<songs.size();i++){
            System.out.println(songs.get(i).getName() + "\n" +
                    songs.get(i).getDuration());
        }
    }

}
