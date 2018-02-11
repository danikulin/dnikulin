package ru.job4j.max;
/**
 * Max.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1
 * @since 07.02.2018
 */
public class Max {
    /**
     * Метод max.
     * Возвращает большее из 2-х чисел.
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }
    /**
     * Метод max1.
     * Возвращает большее из 3-х чисел.
     */
    public int max1(int first, int second, int third) {
        return this.max(this.max(first, second), third);
    }
}

