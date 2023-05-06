package exceptions;

public class InvalidBookingNotFoundException extends Exception {
    public InvalidBookingNotFoundException(Long id){
        super("Booking not found by id: %d");
    }
}
