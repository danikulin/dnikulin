package ru.job4j.loop;
/**
 * Counter.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1
 * @since 13.02.2018
 */
public class Counter {
    /**
     * Метод add.
     * Возвращает сумму четных чисел в диапазоне от start до finish.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            if (index % 2 == 0) {
                sum = sum + index;
            }
        } return sum;
    }
}