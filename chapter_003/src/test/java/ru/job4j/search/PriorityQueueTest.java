package ru.job4j.search;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * PriorityQueueTest.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 08.08.2018
 */
public class PriorityQueueTest {
    /**
     * Test put.
     * Проверяет добавление задач в соответствии с приоритетом.
     */
    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("One", 2));
        queue.put(new Task("Thoo", 3));
        queue.put(new Task("low", 1));
        Task result = queue.take();
        assertThat(result.getDesc(), is("low"));
    }
}
