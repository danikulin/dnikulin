package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 07.03.2018
 */
public class TurnTest {
    /**
     * Test back1.
     * Проверяет переворот массива с четным числом элементов.
     */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn rst = new Turn();
        int[] array = new int[] {4, 2, 3, 5};
        int[] rstarray = rst.back(array);
        int[] expected = new int[] {5, 3, 2, 4};
        assertThat(rstarray, is(expected));
    }
    /**
     * Test back2.
     * Проверяет переворот массива с нечетным числом элементов.
     */
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn rst = new Turn();
        int[] array = new int[] {4, 2, 3, 5, 4};
        int[] rstarray = rst.back(array);
        int[] expected = new int[] {4, 5, 3, 2, 4};
        assertThat(rstarray, is(expected));
    }
}