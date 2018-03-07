package ru.job4j.array;
/**
 * Turn.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 07.03.2018
 */
public class Turn {
    /**
     * Метод back.
     * Переворачивает массив.
     * @param array массив который надо перевернуть.
     */
    public int[] back(int[] array) {
        int[] rst = new int[array.length];
       for (int i = 0; i != array.length; i++) {
                rst[array.length - 1 - i] = array[i];
            }
        return rst;
    }
}