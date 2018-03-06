package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 06.03.2018
 */
public class FindLoopTest {
    /**
     * Test indexoff.
     * Проверяет нахождение в массиве нужного элемента.
     */
    @Test
    public void whenElThenIndex() {
        FindLoop index = new FindLoop();
        int[] date = new int[] {4, 2, 1, 5, 9, 10};
        int rst = index.indexoff(date, 10);
            System.out.println(rst);
        int expected = 5;
        assertThat(rst, is(expected));
    }
    /**
     * Test indexoff.
     * Проверяет вывод -1 если искомый элемент в массиве отсутствует.
     */
    @Test
    public void whenElNoThenOne() {
        FindLoop index = new FindLoop();
        int[] date = new int[] {4, 2, 1, 5, 9, 10};
        int rst = index.indexoff(date, 15);
        System.out.println(rst);
        int expected = -1;
        assertThat(rst, is(expected));
    }
}