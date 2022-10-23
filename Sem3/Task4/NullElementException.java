package Sem3.Task4;

public class NullElementException extends NullPointerException {
    public NullElementException(String msg) {
        super(msg);
    }

    public NullElementException() {
        super();
    }
}
