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
public class CounterTest {
    /**
     * Test add.
     * Проверяет сумму четныx чисел в диапазоне от start до finish.
     */
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter sum = new Counter();
        int result = sum.add(1, 10);
        assertThat(result, is(30));
    }
}