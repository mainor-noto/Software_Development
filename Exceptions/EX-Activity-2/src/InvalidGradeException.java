
public class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }

    public InvalidGradeException() {
        super("Invalid Grade");
    }
}
