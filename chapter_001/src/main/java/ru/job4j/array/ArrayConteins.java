package ru.job4j.array;
/**
 * ArrayConteins.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 22.03.2018
 */
public class ArrayConteins {
    /**
     * Принимает два слова.
     * @param origin первое слово.
     * @param sub второе слово.
     * Проверяет, что второе слово находится внутри первого.
     */
    public boolean conteins(String origin, String sub) {
        boolean result = false;
        char[] date = origin.toCharArray();
        char[] value = sub.toCharArray();
        for (int i = 0; i <= date.length - value.length; i++) {
            if (date[i] == value[0]) {
                result = true;
                for (int j = 1; j != value.length; j++) {
                    if (value[j] != date[i + j]) {
                        result = false;
                    }
                }
            }
        }
        return result;
    }
}