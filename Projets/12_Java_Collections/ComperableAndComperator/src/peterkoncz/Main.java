package peterkoncz;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Comparable and Comparator interfaces
 * seat class override te compare to method
 * so the compare to should return a num : less than 0 if the object should sort less then the object that being compared to
 *                                       : greater than 0 if if we should sort greater than the object being compared to
 *                                       : and return 0 if they are equal! exactly like the one with the String !
 *
 */
public class Main {

    public static void main(String[] args) {
	// Create an Instance of a class
        Theatre theatre = new Theatre("Sydney", 8,12);


        if (theatre.reservedSeat("D12")){
            System.out.println("please pay for D12");
        }else{
            System.out.println("Seat already reserved");
        }

        if (theatre.reservedSeat("B13")){
            System.out.println("please pay for B13");
        }else{
            System.out.println("Seat already reserved");
        }

        List<Theatre.Seat> reverseList = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseList);
        printList(reverseList);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00",13.00));
        priceSeats.add(theatre.new Seat("A00",13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);
    }

    //print list method
    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat : list){
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("===========================================================================");
    }




  }

