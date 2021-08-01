package peterkoncz;


import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * We are going to look at the reverse sort method at the collections Class we already used the
 * Sort method before but here we are going to see some collection methods!
 *
 * we can create a new array of seat objects and if we pars the existing seats from our theater object,
 * we are going to a new list containing all the seats!
 *
 * The method that we used to create seatCopy and populate all the elements on theatre.seat is called shallow copy
 * So what that does is create an array list containing all the elements from the list that were parsed to the
 * constructor
 * These are not copied so if we change something the other list will be changed too
 * they still the same shared object
 *
 * we can see some functions in java Collections
 * like: shuffle,sort,reverse also min and max (return the smallest or largest values)
 * also swap method which swaps the items inside the list
 *
 * rather odd copy method provided by collections class
 * takes two parameters the destination and the source list and the destination has to be a generic type
 * there is a super set of the source list, what it means:(it can be collection an iterable or list)
 * and the source is must be a list!
 *
 * the problem is with the cope method that people may expect it creates a deep copy of the list but just a shallow copy
 */
public class Main {

    public static void main(String[] args) {
	// Create an Instance of a class
        Theatre theatre = new Theatre("Sydney", 8,12);
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();                     // we use the copy here
        if (theatre.reservedSeat("A02")){  // and we go back and reserving the seat from the other array list
            System.out.println("please pay for A02"); //just proves that we are sharing the same data
        }else{
            System.out.println("Seat already reserved");
        }

        // use the collection.reverse method
        //they are clearly different arrayList but refer to the same object
        Collections.reverse(seatCopy);
        Collections.shuffle(seatCopy);//shuffle method in collection which shuffles the elements randomly
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing theatre.seats");
        printList(theatre.seats);


        //min and max functions
        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        System.out.println("Max seat number is " + maxSeat.getSeatNumber());

        //use our sort method
        sortList(seatCopy);
        System.out.println("Printing the sorted seatCopy");
        printList(seatCopy);


        //this is typical to see trying to do something like this do do not fail (because copy a collections copy method is gonna fail as the destination is big enough to hold all the elements to be copied into it)
        //so it leads to a problem ant it is typical to see this:
        //This does not work!!!
        //sets the capacity but it is containing non !
        //so to get this to work get the copy to work you actually need to have 96 seed object in the newList before we can attempt to copy
        List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size());
        Collections.copy(newList, theatre.seats);

    }

    //print list method
    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat : list){
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("===========================================================================");
    }

//This is  a sort list method with nested loop and not the built in
  //swap apply
    //still slower than the built in method but can be useful in situations where speed wasn't so important
    //but memory is !
    //the sort list method is generic can sort any kind of theatre seat list as long as they implement the comparable interface
    //
    public static void sortList(List<? extends Theatre.Seat> list){
        for (int i = 0; i<list.size()-1; i++){
            for (int j = i+1; j<list.size(); j++){
                if (list.get(i).compareTo(list.get(j)) > 0){
                    Collections.swap(list,i,j);
                }
            }
        }
    }




















}
