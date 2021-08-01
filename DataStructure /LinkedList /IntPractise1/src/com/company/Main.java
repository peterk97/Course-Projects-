package com.company;
// linkedList basics
//we are going to create nodes   and each node has a value and a reference for the next node
public class Main {

    public static void main(String[] args) {

        // create my LinkedList
        MyLinkedList list = new MyLinkedList();
        list.insert(18);
        list.insert(45);
        list.insert(6);
        list.insert(13);
        list.insert(29);
        list.insert(1);
        list.insertAtStart(25);

        list.deleteAt(2);

        list.print();



    }
}
