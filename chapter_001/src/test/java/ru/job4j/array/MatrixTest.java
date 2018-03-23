package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * MatrixTest.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 11.03.2018
 */
public class MatrixTest {
    /**
     * Test multiple.
     * Проверяет заполнение массива перемножением индексов.
     */
    @Test
    public void whenSizeThreeThenArray() {
        Matrix array = new Matrix();
        int[][] result = array.multiple(3);
        int[][] expected = {{1, 2, 3},
                            {2, 4, 6},
                            {3, 6, 9}};
        assertThat(result, is(expected));
    }
}