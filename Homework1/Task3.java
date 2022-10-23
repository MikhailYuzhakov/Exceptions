package Homework1;

public class Task3 {
    public static void main(String[] args) {
        int[] arr1 = {10, 12, 11, 8, 5};
        int[] arr2 = {5, 6, 5, 4, 2};

        System.out.println(print(divideArrays(arr1, arr2)));
    }

    public static int[] divideArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        int minLen = minLen(arr1, arr2);
        int[] arr = new int[minLen];
        for (int i = 0; i < minLen; i++) {
            arr[i] = arr1[i] / arr2[i];
        }
        return arr;
    }

    public static int minLen(int[] arr1, int[] arr2) {
        if (arr1.length < arr2.length) return arr1.length;
        else return arr2.length;
    }

    public static String print(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i : arr) {
            sb.append(i).append(", ");
        }
        sb.append("}");
        return sb.toString();
    }
}
