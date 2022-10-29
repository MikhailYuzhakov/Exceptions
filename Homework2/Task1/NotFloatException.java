package Task1;

import java.util.InputMismatchException;

public class NotFloatException extends InputMismatchException {
    public NotFloatException(String msg) {
        super(msg);
    }
}