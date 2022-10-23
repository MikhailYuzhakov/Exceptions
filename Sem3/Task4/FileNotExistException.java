package Sem3.Task4;

import java.io.IOException;

public class FileNotExistException extends IOException {
    public FileNotExistException(String msg) {
        super(msg);
    }

    public FileNotExistException() {
        super();
    }
}
