package ru.job4j.array;
/**
 * Matrix.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 11.03.2018
 */
public class Matrix {
    /**
     * Метод multiple.
     * Заполняет массив перемножением индексов (таблица умножения).
     * @param size размер массива.
     */
    int[][] multiple(int size) {
        int[][] rst = new int[size][size];
        for (int i = 0; i != size; i++) {
            for (int j = 0; j != size; j++) {
                rst[i][j] = (i + 1) * (j + 1);
            }
        }
        return rst;
    }
}