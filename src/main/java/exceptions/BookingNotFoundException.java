package exceptions;

public class BookingNotFoundException extends Exception {

    public BookingNotFoundException(Long id) {
        super("Booking not found with id: " + id);
    }

}