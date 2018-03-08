package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 08.03.2018
 */
public class BubbleSortTest {
    /**
     * Test sort.
     * Проверяет сортировку массива.
     */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
       BubbleSort rst = new BubbleSort();
        int[] array = new int[] {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] rstarray = rst.sort(array);
        int[] expected = new int[] {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(rstarray, is(expected));
    }
}