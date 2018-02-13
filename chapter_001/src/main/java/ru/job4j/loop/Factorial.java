package ru.job4j.loop;
/**
 * Counter.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1
 * @since 13.02.2018
 */
public class Factorial {
    /**
     * Метод calc.
     * Возвращает факториал числа n.
     * При n=0, возвращает 1.
     */
    public int calc(int n) {
        int f = 1;
        if (n == 0) {
            f = 1;
        } else {
            for (int index = 1; index <= n; index++) {
                f = f * index;
            }
        }
        return f;
    }
}