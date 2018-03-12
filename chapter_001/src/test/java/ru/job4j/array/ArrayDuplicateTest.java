package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 12.03.2018
 */
public class ArrayDuplicateTest {
    /**
     * Test remuve1.
     * Проверяет удоление дублей из массива.
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] inarray = {"Kate", "Liza", "Liza", "Kate"};
        String[] rstarray = duplicate.remuve(inarray);
        String[] expected = {"Kate", "Liza"};
        assertThat(rstarray, arrayContainingInAnyOrder(expected));
    }
    /**
     * Test remuve2.
     * Проверяет удоление дублей из массива.
     */
    @Test
    public void whenAllElementsDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] inarray = {"Kate", "Kate", "Kate", "Kate"};
        String[] rstarray = duplicate.remuve(inarray);
        String[] expected = {"Kate"};
        assertThat(rstarray, arrayContainingInAnyOrder(expected));
    }
}