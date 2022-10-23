package Sem3.Task5;

public class MyArraySizeException extends IndexOutOfBoundsException {
    public MyArraySizeException(String msg) {
        super(msg);
    }

    public MyArraySizeException() {
        super();
    }
}
