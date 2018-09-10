package ru.job4j.list;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * ConvertList2ArrayTest.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 04.09.2018
 */
public class ConvertList2ArrayTest {
    /**
     * Test toArray1.
     * Проверяет перевод листа в двумерный массив когда количество строк не кратно количеству элементов.
     */
    @Test
    public void when7ElementsThen9() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(Arrays.asList(1, 2, 3, 4, 5, 6, 7), 3);
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(expect));
    }
    /**
     * Test toArray2.
     * Проверяет перевод листа в двумерный массив когда количество строк кратно количеству элементов.
     */
    @Test
    public void when6ElementsThen2() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(Arrays.asList(1, 2, 3, 4, 5, 6), 2);
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6}
        };
        assertThat(result, is(expect));
    }
    /**
     * Test toArray3.
     * Проверяет перевод листа в двумерный массив когда количество строк кратно количеству элементов.
     */
    @Test
    public void when6ElementsThen3() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(Arrays.asList(1, 2, 3, 4, 5, 6), 3);
        int[][] expect = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        assertThat(result, is(expect));
    }
    @Test
    public void when3ArraysThen9() {
        ConvertList2Array list = new ConvertList2Array();
        List<int[]> input = {{}}
        List<Integer> result = list.convert(Arrays.asList(1, 2, 3, 4, 5, 6), 3);
        int[][] expect = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        assertThat(result, is(expect));
    }
}
