package com.timbuchalka;



import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Brisbane");
        addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Canberra");
        addInOrder(placesToVisit,"Adelaide");
        addInOrder(placesToVisit,"Darwin");
        printList(placesToVisit);

        addInOrder(placesToVisit,"Alice Springs");
        addInOrder(placesToVisit,"Darwin");
        printList(placesToVisit);


        visit(placesToVisit);

//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");
//        printList(placesToVisit);

        //insert a record
//        placesToVisit.add(1,"Alice Springs");
//        printList(placesToVisit);

//        placesToVisit.remove(4);
//        printList(placesToVisit);
    }










    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator(); // equivalent of a for loop
        while (i.hasNext()){// is there another entry ?
            System.out.println("Now visiting " + i.next());//i.next like i++ it gives you the current record but also moves on to the next one!
        }
        System.out.println("==========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity ){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);  // gives us a number if it is 0 it means equals to the new city so they are matched!
               if (comparison == 0){                                        //the stringListIterator is not pointing to the first entry you must use the .next() to point it to the first entry!!
                   //equal, do not add
                   System.out.println(newCity + " is already included!");
                   return false;
               }else if (comparison > 0){
                                                         // new city should appear before this one
                                                         //Brisbane -> Adelaide = Adelaide will be add first
                                                        //but there is an issue here because we already used .next() which returned the current entry but moved to the next one
                                                           //what we need to do we need to move back one and after forward.
                   stringListIterator.previous(); //special feature of list iterator because a simple iterator go trough all the records but no way to go back to the previous
                   stringListIterator.add(newCity);//but  this is a special iterator and you can mov back
                    return true;
               }else if (comparison<0){
               //move on next city
                //because we already add .next() it is gonna ove on
               }
        }
        //we have gone trough the whole list with the loop to fnd a suitable place point to insert the entry so the new entry has to go to the end of the list!
        stringListIterator.add(newCity);
        return true;
    }


    // Crate a menu to go forward and back
        private static void visit(LinkedList cities){
            Scanner scanner = new Scanner(System.in);
            boolean quit = false;
            boolean goingForward = true;
            ListIterator<String> listIterator = cities.listIterator();

            if (cities.isEmpty()){
                System.out.println("No cities in the Program!");
                return;
            }else {
                System.out.println("Now visiting " + listIterator.next());
                printMenu();
            }

            while (!quit){
                int action = scanner.nextInt();
                scanner.nextLine();

                switch (action){
                    case 0:
                        System.out.println("Holiday is over!");
                        quit = true;
                        break;
                    case 1:
                                if (!goingForward){  //extra check !! because of the list iterator
                                    if (listIterator.hasNext()){
                                        listIterator.next();
                                    }
                                        goingForward = true;
                                }

                                if (listIterator.hasNext()){
                                    System.out.println("Now visiting " + listIterator.next());
                                }else {
                                    System.out.println("Reached the end of the list");
                                    goingForward = false;
                                }
                                break;
                    case 2:
                        if (goingForward){//extra check !! because of the list iterator
                            if (listIterator.hasPrevious()){
                                listIterator.previous();
                            }
                            goingForward = false;
                        }

                        if (listIterator.hasPrevious()){
                            System.out.println("now visiting " + listIterator.previous());
                        }else {
                            System.out.println("We are at the start of the list!");
                            goingForward = true;
                        }
                        break;
                    case 3:
                        printMenu();
                }
            }
        }

        //Print menue
    private static void printMenu(){
        System.out.println("Available options:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu");
    }



}
















