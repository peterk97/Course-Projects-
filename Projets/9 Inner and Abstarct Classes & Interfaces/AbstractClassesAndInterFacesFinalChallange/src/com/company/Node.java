package com.company;


//this extends ListItem abstract class!
public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLing;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLing = item;
        return this.rightLing;
    }

    @Override
    ListItem previous() {
        return leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
       this.leftLink = item;
        return leftLink;
    }

    @Override
    int compareTo(ListItem item) { //the compare method return -1 if the item should be sorted before the object otherwise a 1 and 0 if they are equals !!!!
        if (item != null) { //if the null passed automatically returning -1 because you cannot compare that
            return ((String) super.getValue()).compareTo((String) item.getValue());//here we are transform the object to a String than we can use the compareTo() method
        } else {//to compare the object and it is going to return 0 -1 or 1 depending of the value
            return -1; //if you write your own class you must writhe a compareTo() method!!!
        }
    }
}
