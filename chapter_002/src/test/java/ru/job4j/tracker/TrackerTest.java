package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * TrackerTest.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 03.03.2018
 */
public class TrackerTest {
    /**
     * Test add.
     * Проверяет добавление новой заявки в массив заявок.
     *
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }
    /**
     * Test replace.
     * Проверяет замену заявки в массиве заявок.
     */
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2", 1234L);
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }
    /**
     * Test delete.
     * Проверяет удаление заявки из массива заявок.
     */
    @Test
    public void whenDeleteItemThenNewItems() {
        Tracker trecker = new Tracker();
        Item first = new Item("Test1", "TestDescript1", 123L);
        trecker.add(first);
        Item second = new Item("Test2", "TestDescript2", 1234L);
        trecker.add(second);
        trecker.delete(first.getId());
        assertThat(trecker.findAll()[0], is(second));
    }
    /**
     * Test findAll.
     * Проверяет нахождение всех заявок в массиве без нулевых.
     */
    @Test
    public void whenFindAllThanAllItems() {
        Tracker trecker = new Tracker();
        Item first = new Item("Test1", "TestDescript1", 123L);
        trecker.add(first);
        Item second = new Item("Test2", "TestDescript2", 1234L);
        trecker.add(second);
        Item[] expected = {first, second};
        assertThat(trecker.findAll(), is(expected));
    }
    /**
     * Test findByName.
     * Проверяет нахождение заявки в массиве заявок по имени.
     */
    @Test
    public void whenNameTest1ThenFindByNameItemTest1() {
        Tracker trecker = new Tracker();
        Item first = new Item("Test1", "TestDescript1", 123L);
        trecker.add(first);
        Item second = new Item("Test1", "TestDescript2", 1234L);
        trecker.add(second);
        Item third = new Item("Test3", "TestDescript2", 1234L);
        trecker.add(third);
        Item[] expected = {first, second};
       assertThat(trecker.findByName("Test1"), is(expected));
    }
    /**
     * Test findById
     * Проверяет нахождение заявки в массиве заявок по Id.
     */
    @Test
    public void whenFindByIdThenItemId() {
        Tracker trecker = new Tracker();
        Item first = new Item("Test1", "TestDescript1", 123L);
        trecker.add(first);
        assertThat(trecker.findById(first.getId()), is(first));
    }
    /**
     * Test findById2
     * Проверяет, выведение null при отсутствии заявки с заданным Id в массиве заявок.
     */
    @Test
    public void whenIdDesabledThenFindByIdNull() {
        Tracker trecker = new Tracker();
        Item first = new Item("Test1", "TestDescript1", 123L);
        trecker.add(first);
        Item expected = null;
        assertThat(trecker.findById("asd"), is(expected));
    }
}
