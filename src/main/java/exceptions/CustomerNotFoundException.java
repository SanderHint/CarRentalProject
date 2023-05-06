package exceptions;

public class CustomerNotFoundException extends Exception {

    public CustomerNotFoundException(Long id) {
        super("Customer not found with id: " + id);
    }

}