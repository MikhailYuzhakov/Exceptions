/**
 * Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив. 
Необходимо посчитать и вернуть сумму элементов этого массива. 
При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами 
(кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1. 
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
 */

 /**
  * Sem1
  */
 public class Sem1 {
 
     public static void main(String[] args) {
        int arr[][] = {{0,1,0,1}, {0,0,1,0}, {1,0,1,1}, {0,0,1,1}};
        int sum = arraySum(arr);
        System.out.println(sum);
     }

     public static int arraySum(int arr[][]) {
        int sum = 0;
        if (arr.length != arr[0].length) {
            throw new RuntimeException("Длина не равна ширине массива.");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 0 && arr[i][j] != 1) {
                    throw new RuntimeException("Массив содержит элементы отличные от 0 или 1.");
                }
                sum += arr[i][j];
            }
        }
        return sum;
     }
 }