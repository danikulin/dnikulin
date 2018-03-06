package ru.job4j.array;
/**
 * FindLoop.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 06.03.2018
 */
public class FindLoop {
    /**
     * Метод indexoff.
     * Ищет в массиве нужное значение и возвращает индекс значения.
     * Если данное значение отсутствует возвращает -1.
     * @param date массив в котором осуществляется поиск.
     * @param el искомое значение.
     */
    public int indexoff(int[] date, int el) {
        int rst = -1;
       for (int i = 0; i != date.length; i++) {
            if (date[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}