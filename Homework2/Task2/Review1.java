package Task2;

public class Review1 {
    public static void main(String[] args) {
        try {
            int d = 2; //переменную задать отличную от нуля
            int[] intArray = {1, 2, 3, 4, 2, 3, 5, 12, 4, 1, 2, 3, 4}; //для работы необходимо добавить массив
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }   
    }
}
