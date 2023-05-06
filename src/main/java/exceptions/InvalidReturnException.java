package exceptions;

public class InvalidReturnException extends Exception {
    public InvalidReturnException(Long id) {
        super("Invalid return parameters for rental with ID: " + id);
    }
}
