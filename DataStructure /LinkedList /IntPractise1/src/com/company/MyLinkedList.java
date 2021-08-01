package com.company;
//this class will perform all the operations with the nodes
//such as insert delete print(go trough the list).
public class MyLinkedList  implements  MyLList {
    //we have to define the head node first!
    Node head;


    //INSERT METHOD --> ADD ELEMENT AT THE END
    public void insert(int data) {
        //this is going to get an integer and we have to assign it to a node
        // so we have to create a node and all the time we insert we create a new node
        Node node = new Node();
        node.data = data;
        node.next = null; //this the next is null because this is the first value and there is no more so fare

        //we have to check for the head if you already have data or not!!
        //is this the first node ??
        if (head == null) {
            //here you don't have any nodes on the list
            head = node;
        } else {
            //if there is not the first we assign a 'n' a new node as a head because we will insert it at the and so we have to
            //travel from the first(head) to the and and go trough the list and check where is the end
            //we have to stop when rich null !!
            Node n = head;

            while (n.next != null) {// this is how we travel while it is not null we keep going!
                n = n.next; //with this you re assign the n while you rich null so you keep jumping to the next node
            }
            n.next = node; // the this is equals to the new node what we created because when the loop gets over
            //you are at the last node you have to insert a new value after !
        }

    }

    //INSERT --> ELEMENT AT THE START!
    public void insertAtStart(int data) {
        //you have to change the head location from the current obj. to a new obj.
        //so it will refer th previous head element so it will hold the ID/reference of the previous head element
        Node node = new Node();
        node.data = data;
        node.next = null;

        node.next = head;//initially this wah the head so we can say node.next = head then after we reassign the head!!
        // so we changed the reference here !! we are assigning the new node's (next) reference to the odl (previous head value)

        head = node; //the current node became the head
    }

    // INSERT IN ANY LOCATION !!!!
    public void insertAt(int index, int data) {
        Node node = new Node(); //this is the same at any insert
        node.data = data;
        node.next = null;

        if (index == 0) { // we have to check if we want to insert at the location 0 it is going to be the head so we just call the insertAtStart
            insertAtStart(data);
        } else {

            Node n = head; // so we have to travel again and it is always starts from the head!
        for (int i = 0; i < index - 1; i++) { // index-1 is important because we want to insert after the 1.
            n = n.next; //every time you travel you have to say n.next!! this is how you move and because of this you have to say index-1 because this is gonna be the next node so you have to extract one
            //so insert is going to be the next node
        }

        //once you reached this point you have to change the addresses
        node.next = n.next; //here we changed the new node's reference to the next node's reference which was already there
        n.next = node; // this is change the reference of the previous node to point to the new inserted node
    }

}

//DELETE METHOD
    public void deleteAt(int index){ // all we did here just checked if the head is deleted because if yes just re-assigned the head
        if (index == 0 ){           //if not the head but some index position just travel there from the head as we did already at insert
            head = head.next;       // and we are just changing the reference of the value of the one before what we want to delete to
        }else{                      // -> hold the reference of the one after we deleted so if we delete index 1 we set the 0's reference to hold 2.
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index-1; i++){
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            //System.out.println("n1 " + n1)
            n1 = null;
        }
    }


//PRINT METHOD
    public void print (){
        // to  print the values is almost the same you have to travel from the head trough the list and each value and the last !
        Node node = head;
        while (node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        //because the last reference is null because that is not holding any other values it not gets printed
        //so it will stop as soon as you rich null -> it will not print data that have object null
        //print it manually
        System.out.println(node.data);
    }

}
