package Level3.Exceptions;

public class ExceptionSeatNotValid extends RuntimeException {
    public ExceptionSeatNotValid() {
        super("That seat does not exist.");
    }
}
