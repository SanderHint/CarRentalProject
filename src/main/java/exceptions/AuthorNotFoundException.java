package exceptions;

public class AuthorNotFoundException extends Exception{
    private static final long serialVersionUID = 1L;

    public AuthorNotFoundException(String firstName) {
        super(String.format("Authority not found for firstName : %s" , firstName));
    }
}
