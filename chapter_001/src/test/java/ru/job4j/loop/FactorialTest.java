package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1
 * @since 13.02.2018
 */
public class FactorialTest {
    /**
     * Test calc1.
     * Проверяет значение факториала числа 5.
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial f = new Factorial();
        int result = f.calc(5);
        assertThat(result, is(120));
    }
    /**
     * Test calc2.
     * Проверяет значение факториала числа 0.
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial f = new Factorial();
        int result = f.calc(0);
        assertThat(result, is(1));
    }
}