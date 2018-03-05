package ru.job4j.array;
/**
 * Square.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 05.03.2018
 */
public class Square {
    /**
     * Метод calculate.
     * Заполняет массив элементами от 1 возведенными в квадрат.
     * @param bound число элементов массива.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i != bound; i++) {
            rst[i] = (int) Math.pow(i + 1, 2);
        }
        return rst;
    }
}