package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 05.03.2018
 */
public class ScuareTest {
    /**
     * Test calculate.
     * Проверяет заполнение массива.
     */
    @Test
    public void whenArray() {
        Square array = new Square();
        int[] rst = array.calculate(4);
        for (int i:rst) {
            System.out.println(i);
        }
        int[] expected = new int[] {1, 4, 9, 16};
        assertThat(rst, is(expected));
    }
}