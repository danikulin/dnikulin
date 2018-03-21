package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 21.03.2018
 */
public class ArrayMergeTest {
    /**
     * Test merge1.
     * Проверяет слияние двух упорядоченных по возростанию массивов в третий, упорядоченный по возростанию.
     */
    @Test
    public void whenFirstBigArrayAndSecondArrayThenResultArraySort() {
        int[] first = {0, 3, 3, 8, 9, 12, 56, 81};
        int[] second = {1, 2, 3, 7, 13, 96};
        ArrayMerge array = new ArrayMerge();
        int[] arrayresult = array.merge(first, second);
        int[] expected = {0, 1, 2, 3, 3, 3, 7, 8, 9, 12, 13, 56, 81, 96};
        assertThat(arrayresult, is(expected));
    }
    /**
     * Test merge2.
     * Проверяет слияние двух упорядоченных по возростанию массивов в третий, упорядоченный по возростанию.
     */
    @Test
    public void whenFirstSmolArrayAndSecondArrayThenResultArraySort() {
        int[] first = {1, 2, 3, 7, 13, 96};
        int[] second = {0, 3, 3, 8, 9, 12, 56, 81};
        ArrayMerge array = new ArrayMerge();
        int[] arrayresult = array.merge(first, second);
        int[] expected = {0, 1, 2, 3, 3, 3, 7, 8, 9, 12, 13, 56, 81, 96};
        assertThat(arrayresult, is(expected));
    }
}