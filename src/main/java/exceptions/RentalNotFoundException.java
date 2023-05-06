package exceptions;

public class RentalNotFoundException extends Exception {
    public RentalNotFoundException(Long id) {
        super("Rental not found with ID: " + id);
    }
}