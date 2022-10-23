package Sem3.Task4;

import java.io.File;
import java.io.IOException;

public class Methonds {
    String[] str = {"a", "b", "c"};

    public Methonds() {
        super();
    }

    public double divide(int a, int b) throws DivideByZeroException {
        try {
            return a/b; 
        } catch (ArithmeticException e) {
            throw new DivideByZeroException("Делить на ноль нельзя");
        }
    }

    public void openFile() throws FileNotExistException {
        File file = new File("t/d/est");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new FileNotExistException("Файла не существует");
        }
    }

    public String findElemtnById(int index) throws NullElementException {
        try {
            return str[index];
        } catch (NullPointerException e) {
            throw new NullElementException("Элемента не существует");
        }
    }
}
