package com.company;

import java.util.ArrayList;

public class  GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    //AddItems
    public void addItem (String item){
        groceryList.add(item);
    }
//Getter
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    //printGroceryList
    public void printList (){
        System.out.println("You have " + groceryList.size() + " items in your list");
        for (int i = 0; i<groceryList.size();i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    //ModifyItem
    //overloaded method
    public void modifyItem (String currentItem, String newItem){
        int position = findItem(currentItem);
        if (position>=0){
            modifyItem(position,newItem);
        }else{
            System.out.println("Cannot find item !");
        }
    }
    private void modifyItem (int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item " + newItem + " has been modified.");
    }

    //RemoveItem
    //overloaded method
    public void removeItem (String item){
        int position = findItem(item);
        if (position>=0){
           removeItem(position);
        }else{
            System.out.println("Cannot find item !");
        }
    }

    private void removeItem (int position){
        groceryList.remove(position);
    }

    //Query/find an item!
    private int findItem (String searchItem) {
        //boolean exist = groceryList.contains(searchItem); //this built in function returns a true/false if the item is exist on the list
        return groceryList.indexOf(searchItem); //this indexOf is going to return the number of the item the index umber!
                                                 // returns the item based on the index
    }

    public boolean onFile (String searchItem){
        int position = findItem(searchItem);
        if(position>=0){
            return true;
        }
        return false;
    }
}


//this class contains all the background functionality of the application and it is hided from the user
//this is an encapsulation !!
//