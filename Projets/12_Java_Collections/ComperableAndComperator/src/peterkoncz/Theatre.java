package peterkoncz;

import java.util.*;

/**
 * we added prices to the seats depending of where is the seat placed
 *
 * At the comparator is an anonymous inner class implementing comparator
 * and it is providing an implementation of the single compare method
 */

public class Theatre {

    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();


    /*
     The issue is like at the compare To method returns 0 if the object are equals because they are the same seat
     but the comparator returns 0 if the price is equal but more seat can be with the same price so this causes problems with
     sorted sets and maps that uses a comparator like this this is inconsistent with equals
     easy to fix just do further test on the seat number whenever the price is equal !

     bottom line you cannot use it this way because it can return more with a same price 
     */
    static final Comparator<Seat> PRICE_ORDER;

    static {
        PRICE_ORDER = new Comparator<Seat>() { //does not have to be static but easier if we don't need an instance ot use it
            @Override
            public int compare(Seat seat1, Seat seat2) {
                if (seat1.getPrice() < seat2.getPrice()) {
                    return -1;
                } else if (seat1.getPrice() > seat2.getPrice()) {
                    return 1;
                } else {
                    if (seat1.getSeatNumber().compareTo(seat2.getSeatNumber()) < 0){
                        return -1;
                    }else if(seat1.getSeatNumber().compareTo(seat2.getSeatNumber()) > 0){
                        return 1;
                    }else {
                        return 0;
                    }
                }
            }
        };
    }

    public Theatre(String theatreName, int numOfRows, int seatsPerRow) {
        this.theatreName = theatreName;

        //Create the seats
        int lastRaw = 'A' + (numOfRows - 1);
        for (char row = 'A'; row <= lastRaw; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                double price = 12.00;//base
                if((row < 'D') && (seatNum >= 4 && seatNum <= 9)){
                    price = 14.00;//premium
                } else if ((row > 'F') || (seatNum < 4 || seatNum > 9)){
                    price = 7.00;//shit seats
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum),price);// we add the price to the constructor
                seats.add(seat);
            }
        }
    }


    public String getTheatreName() {
        return theatreName;
    }

    //reserved seat method
    /**
     * There is a big change here because we are implementing a binary search here !!!
     * @param seatNumber
     * @return
     */
    public boolean reservedSeat(String seatNumber) {
        //binary search!
        Seat requestedSeat = new Seat(seatNumber,0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
    }


    //for testing
    public Collection<Seat> getSeats() {
        return seats;
    }


    //Inner class seat

    /**
     * because the seat class implements the comparable interface we have to override compare to
     */
    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;
        private double price;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
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

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
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

        public double getPrice() {
            return price;
        }
    }


}

















