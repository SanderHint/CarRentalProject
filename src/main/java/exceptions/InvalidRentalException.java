package exceptions;

    public class InvalidRentalException extends RuntimeException {
        public InvalidRentalException(Long id) {
            super("Rental not found by id: %d");
        }
}
