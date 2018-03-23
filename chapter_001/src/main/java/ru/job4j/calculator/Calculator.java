package ru.job4j.calculator;
/**
 * Calculator.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1
 * @since 30.01.2018
 */
public class Calculator {
    private double result;
    /**
     * Метод сложение.
     * @param first первый аргумент.
     * @param second второй аргумент.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }
    /**
     * Метод вычетание.
     * @param first первый аргумент.
     * @param second второй аргумент.
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }
    /**
     * Метод деление.
     * @param first первый аргумент.
     * @param second второй аргумент.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }
    /**
     * Метод умножение.
     * @param first первый аргумент.
     * @param second второй аргумент.
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }
    /**
     * Метод getResult.
     * @return результат.
     */
    public double getResult() {
        return this.result;
    }
}