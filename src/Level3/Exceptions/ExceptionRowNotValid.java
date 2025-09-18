package Level3.Exceptions;

public class ExceptionRowNotValid extends RuntimeException {
    public ExceptionRowNotValid() {
        super("That row does not exist.");
    }
}
