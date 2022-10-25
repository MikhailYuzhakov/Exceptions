package Task2;

public class Review2 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2, 7, 3}; //добавить элементов, чтобы видеть индекс 3
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) { //поместить после других исключений, иначе до других дел не дойдет
            System.out.println("Что-то пошло не так...");
        }
    }

     public static void printSum(Integer a, Integer b) { //убрать исключение FileNotFound - к файлу мы не обращаемся
        System.out.println(a + b);
     }
}
