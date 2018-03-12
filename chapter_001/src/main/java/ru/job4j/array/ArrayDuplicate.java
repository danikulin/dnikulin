package ru.job4j.array;

import java.util.Arrays;
/**
 * ArrayDuplicate.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 12.03.2018
 */
public class ArrayDuplicate {
    /**
     * Метод remuve.
     * Удоляет дубли в массиве.
     * @param array массив в котором надо удалить дубли.
     */
    public String[] remuve(String[] array) {
        int unikal = array.length;
        for (int i = 0; i != unikal; i++) {
            for (int j = i + 1; j != unikal; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = array[unikal - 1];
                    unikal--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, unikal);
    }
}