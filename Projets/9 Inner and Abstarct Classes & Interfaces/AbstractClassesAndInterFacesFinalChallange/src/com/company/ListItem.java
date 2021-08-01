package com.company;


//this is the abstract class it is going to hold the object and the previous and the next items reference as a linked list!
//also created a compareTo method to compare if the item already exits
//after this we are going to create a real class which extends this class and implements all the methods
public abstract class ListItem {
    protected ListItem rightLing = null;
    protected ListItem leftLink = null;

   protected Object value; // the object it is a simple java object so you can use anything here in the future

    public ListItem(Object value) { //constructor for the object
        this.value = value;
    }

    abstract ListItem next();//reference for the next item  //this is just a getter
    abstract ListItem setNext(ListItem item);//set the rightLink !
    abstract ListItem previous();//reference for the previous item //this is just a getter
    abstract ListItem setPrevious(ListItem item);//set the leftLink !

    abstract int compareTo(ListItem item); //compare method

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
