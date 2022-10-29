package Task3;

import java.util.Scanner;

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
*/
public class NullString {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String myString = in.nextLine();
            if (myString == null || myString.isEmpty()) {
                throw new RuntimeException("Пустые строки вводить нельзя!");
            }
        }
    }
}