package ru.job4j.list;
import java.util.ArrayList;
import java.util.List;
/**
 * ConvertMatrix2List.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 08.09.2018
 */
public class ConvertMatrix2List {
    /**
     * Метод toList.
     * Переводит двумерный массив в лист.
     * @param array входящий двумерный массив.
     * @return лист.
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] range : array) {
            for (int value : range) {
                list.add(value);
            }
        }
        return list;
    }
}
