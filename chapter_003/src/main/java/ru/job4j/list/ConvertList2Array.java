package ru.job4j.list;
import java.util.*;

/**
 * ConvertList2Array.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 04.09.2018
 */
public class ConvertList2Array {
    /**
     * Метод toArray.
     * Переводит лист в двумерный массив.
     * @param list коллекция которую надо перевести в массив.
     * @param rows колличество строк в массиве.
     * @return двумерный массив.
     */
    public int[][] toArray(List<Integer> list, int rows) {
        int size = list.size();
        while (size % rows != 0) {
            size++;
        }
        int cells = size / rows;
        int[][] array = new int[rows][cells];
        int elm = 0;
        for (int i = 0; i != rows; i++) {
            for (int j = 0; j != cells; j++) {
                if (elm != list.size()) {
                    array[i][j] = list.get(elm);
                    elm++;
                }
            }
        }
        return array;
    }
    /**
     * Метод convert.
     * Переводит лист массивов в лист.
     * @param list лист массивов который нужно перевести.
     * @return лист содержащий все значения массивов входящего листа.
     */
    public List<Integer> convert(List<int[]> list) {
        List<Integer> result = new ArrayList<Integer>();
        return result;

    }
}
