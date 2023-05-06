package exceptions;

public class UserNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public UserNotFoundException(String fullName) {
        super(String.format("User not found for fullName : %s!" , fullName));
    }
    public UserNotFoundException(Long id) {
        super(String.format("User not found for email : %d!" , id));
    }
}

