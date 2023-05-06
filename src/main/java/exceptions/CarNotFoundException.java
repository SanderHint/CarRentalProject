package exceptions;

public class CarNotFoundException extends Exception {

    public CarNotFoundException(Long id) {
        super("Car not found with id: " + id);
    }

}