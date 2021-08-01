package com.company;

//define an interface that any structure using a node objects will implement.
public interface NodeList {
    ListItem getRoot(); //this is gonna be the actual listItem itself
    boolean addItem (ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root); // some way to actually going trough the list
    //this is often called the head of the list but using the term root is also used a lot and actually applies to binary search trees

}
