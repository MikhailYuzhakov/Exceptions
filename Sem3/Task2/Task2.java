package Sem3.Task2;
import java.io.IOException;

/**
 * Создайте метод doSomething(), который может быть источником одного из типов checked exceptions 
 * (тело самого метода прописывать не обязательно). Вызовите этот метод из main и обработайте в нем исключение, 
 * которое вызвал метод doSomething().
 */

 /**
  * Task1
  */
 public class Task2 {
 
     public static void main(String[] args) {
         Smth sm = new Smth();
         try {
            sm.SmthMethod();
        } catch (IOException e) {
            e.printStackTrace();
        }
     }
 }