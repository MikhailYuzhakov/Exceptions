package Sem3.Task5;

public class Methods {
    public Methods() {
        super();
    }

    public int sum(String[][] strs) throws MyArraySizeException, NumberFormatException {      


        int sum = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs.length != strs[i].length) {
                throw new MyArraySizeException("Массив не квадратный");
            }
            for (int j = 0; j < strs[i].length; j++) {
                try {
                    sum += Integer.parseInt(strs[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Не удалось преобразовать в число элемент массива %s в ячейке (%d, %d)",
                                                     strs[i][j], i, j));
                }
            }
        }
        return sum;
    }
}
