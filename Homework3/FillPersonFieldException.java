
import java.util.NoSuchElementException;

public class FillPersonFieldException extends NoSuchElementException {
    public FillPersonFieldException() {
        super();
    }

    public FillPersonFieldException(String msg) {
        super(msg);
    }
}
