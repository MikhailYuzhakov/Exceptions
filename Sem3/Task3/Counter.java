package Sem3.Task3;

public class Counter implements AutoCloseable {
    private int i = 0;
    
    public Counter() {
        super();
    }

    public void add() {
        this.i++;
    }

    @Override
    public void close() throws IllegalStateException {
        System.out.println("Сработал метод close");
    }
}
