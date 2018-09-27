package ru.job4j.comparator;

import java.util.Comparator;
/**
 * ListCompare.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 27.09.2018
 */
public class ListCompare implements Comparator<String> {
    /**
     * Метод compare.
     * Сравнивает две строки в лексикографическом порядке.
     * @param o1 первая строка.
     * @param o2 вторая строка.
     * @return 0 если строки равны, значение > 0 если первая строка больше второй, значение < 0 если первая строка меньше второй.
     */
    @Override
    public int compare(String o1, String o2) {
        int length = o1.length() < o2.length() ? o1.length() : o2.length();
        int result = Integer.compare(o1.length(), o2.length());
        for (int i = 0; i != length; i++) {
            if (Character.compare(o1.charAt(i), o2.charAt(i)) != 0) {
                result = Character.compare(o1.charAt(i), o2.charAt(i));
                break;
            }
        }
        return result;
    }
}
