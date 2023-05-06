package exceptions;

public class RentalOfficeNotFoundException extends Exception {
    public RentalOfficeNotFoundException(Long id) {
        super("Rental office not found with ID: " + id);
    }
}