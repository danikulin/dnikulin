package ru.job4j.list;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * ConvertMatrix2ListTest.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 08.09.2018
 */
public class ConvertMatrix2ListTest {
    /**
     * Test toList1.
     * Проверяет перевод двумерного массива с равной длиной строк в лист.
     */
    @Test
    public void when2onArrayThan4onList() {
        ConvertMatrix2List list = new ConvertMatrix2List();
        int[][] input = {{1, 2}, {3, 4}};
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        List<Integer> result = list.toList(input);
        assertThat(result, is(expected));
    }
    /**
     * Test toList2.
     * Проверяет перевод двумерного массива с неравной длиной строк в лист.
     */
    @Test
    public void when3onArrayThan6onList() {
        ConvertMatrix2List list = new ConvertMatrix2List();
        int[][] input = {{1, 2}, {3, 4, 5}, {6}};
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> result = list.toList(input);
        assertThat(result, is(expected));
    }
}
