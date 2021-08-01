package com.peterkoncz;

import javax.crypto.SealedObject;
import java.util.*;

/**
 * Create seats in a Theatre
 * here we can change the 'seats' List from arrayList to a LinkedList and it still will work
 * and if we want to be really generic we can change it to collections The collection class hold our seat
 * this is demonstrate how array and linked list fit into a collection framework
 * and they can be replaced with other data structure provides benefit for a particular task.
 * but you must stay at the same lvl in hierarchy
 *
 * As we move down in hierarchy the interfaces became more specialized so we can replace
 * classes with other classes that implements on of the core collections interface at the same lvl.
 */

public class Theatre {
    private final String theatreName;
    /*
    //private List<Seat> seats = new LinkedList<>();
    //can use  List/LinkedList/Set/HashSet/LinkedHashSet    ---> They might be in different order
   // private Collection<Seat> seats = new HashSet<>(); //generic / Collection class
   */
    private Collection<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numOfRows, int seatsPerRow) {
        this.theatreName = theatreName;

        //Create the seats
        int lastRaw = 'A' + (numOfRows - 1);
        for (char row = 'A'; row <= lastRaw; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    //reserved seat method
    public boolean reservedSeat(String seatNumber) {
        Seat requestedSeat = null;
        for (Seat seat : seats) {
            System.out.print(".");//with this it will show you with a . how many times the loop went on to find the seat
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }
        if (requestedSeat == null) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
        return requestedSeat.reserve();
    }


    //for testing
    public void getSeats() {
        for (Seat seat : seats) {
            System.out.print(".");
            System.out.println(seat.getSeatNumber());
        }
    }

    //Inner class seat
    private class Seat {
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }


        public boolean cancel (){
            if(this.reserved){
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            }else{
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }


}

















