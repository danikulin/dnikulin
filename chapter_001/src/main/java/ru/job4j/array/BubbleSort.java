package ru.job4j.array;
/**
 * BubbleSort.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 08.03.2018
 */
public class BubbleSort {
    /**
     * Метод sort.
     * Сортирует массив от меньшго к большему.
     * @param array массив который надо отсортировать.
     */
    public int[] sort(int[] array) {
        int znach;
        for (int r = 0; r != array.length; r++) {
            for (int i = 0; i != array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    for (int j = 0; j != array.length - 1; j++) {
                        if (array[j] > array[j + 1]) {
                            znach = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = znach;
                        }
                    }
                }
            }
        }
        return array;
    }
}