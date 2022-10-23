package Sem3.Task3;

/**
 * Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной на 1. 
 * Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources. 
 * Нужно бросить исключение, если работа с объектом типа счетчик была не в ресурсном try и/или ресурс остался открыт. 
 * Подумайте какой тип исключения подойдет лучше всего.
 */
public class Task3 {
    public static void main(String[] args) {
        try (Counter m = new Counter()) {
            m.add();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}