package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 22.03.2018
 */
public class ArrayConteinsTest {
    /**
     * Test conteins1.
     * Проверяет, работу метода если второе слово есть в первом слове.
     */
    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayConteins word = new ArrayConteins();
        boolean result = word.conteins("Привет", "иве");
        assertThat(result, is(true));
    }
    /**
     * Test conteins2.
     * Проверяет, работу метода если второго слова нет в первом слове.
     */
    @Test
    public void whenStartWithPrefixThenFalse() {
        ArrayConteins word = new ArrayConteins();
        boolean result = word.conteins("Досвидания", "видио");
        assertThat(result, is(false));
    }
}