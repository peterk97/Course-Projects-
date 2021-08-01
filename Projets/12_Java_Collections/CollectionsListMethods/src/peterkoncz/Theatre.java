package peterkoncz;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */

public class Theatre {
    private final String theatreName;
    public List<Seat> seats = new ArrayList<>();

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

    /**
     * There is a big change here because we are implementing a binary search here !!!
     * @param seatNumber
     * @return
     */
    public boolean reservedSeat(String seatNumber) {
        int low = 0;
        int high = seats.size()-1;

        while (low <= high) {
            System.out.print(".");
            int mid = (low + high) / 2;
            Seat midVal = seats.get(mid);
            int cmp = midVal.getSeatNumber().compareTo(seatNumber);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return seats.get(mid).reserve();
            }
        }
        System.out.println("There is no seat " + seatNumber);
        return false;
    }
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //binary search!
//        Seat requestedSeat = new Seat(seatNumber);
//        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
//        if (foundSeat >= 0){
//            return seats.get(foundSeat).reserve();
//        }else {
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//  we don't need this anymore ! replaced with binary search!

//        for (Seat seat : seats) {
//            System.out.print(".");//with this it will show you with a . how many times the loop went on to find the seat
//            if (seat.getSeatNumber().equals(seatNumber)) {
//                requestedSeat = seat;
//                break;
//            }
//        }
//        if (requestedSeat == null) {
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }
//        return requestedSeat.reserve();
 //   }


    //for testing
    public void getSeats() {
        for (Seat seat : seats) {
            System.out.print(".");
            System.out.println(seat.getSeatNumber());
        }
    }


    //Inner class seat

    /**
     * we change the seat as public to see the methods in the main class
     */
    public class Seat implements Comparable<Seat>{
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

        //Override the compare to !!
        //returns a num >0, 0, or <0
        //with doing it this way what we got is a comparison that fulfils the interface
        //and now we able to use a different type of set for searching which is lot more efficient
        //--> we are just using the compare to which is built in to String class it is not really specialized
        //but he important thing here is the seat class could contain more than one fields  -> Java wouldn't have any idea which one are we using
        //if you have a more complex class this is where you put your code to testing that comparable interface and then you provide a compare to method
        //that the framework can use!
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
    }


}

















