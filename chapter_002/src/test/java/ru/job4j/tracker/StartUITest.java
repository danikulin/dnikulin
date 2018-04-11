package ru.job4j.tracker;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
/**
 * StartUITest.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 11.04.2018
 */
public class StartUITest {
    /**
     * Test createNewItem.
     * Проверяет создание новой заявки.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }
    /**
     * Test findAllItems.
     * Проверяет показ всех заявок.
     */
    @Test
    public void whenUserFindAllItemsTrackerShowAllItems() {
        Tracker tracker = new Tracker();
        Item first = tracker.add(new Item("test1", "Desc1", 123L));
        Item second = tracker.add(new Item("test2", "Desc2", 1234L));
        Input input = new StubInput(new String[]{"1", "6"});
        new StartUI(input, tracker).init();
        Item[] expected = {first, second};
        assertThat(tracker.findAll(), is(expected));
    }
    /**
     * Test edit.
     * проверяет изменение заявки.
     */
    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        // создаём Tracker
        Tracker tracker = new Tracker();
        //Напрямую добавляем заявку
        Item item = tracker.add(new Item("test", "Desc", 123L));
        //создаём StubInput с последовательностью действий
        Input input = new StubInput(new String[]{"2", item.getId(), "test name", "desc", "6"});
        // создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        assertThat(tracker.findById(item.getId()).getName(), is("test name"));
    }
    /**
     * Test delItem.
     * проверяет удаление заявки.
     */
    @Test
    public void whenUserDeleteItemThenTrackerNotHasItem() {
        Tracker tracker = new Tracker();
        Item first = tracker.add(new Item("test1", "Desc1", 123L));
        Item second = tracker.add(new Item("test2", "Desc2", 1234L));
        Input input = new StubInput(new String[]{"3", first.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0], is(second));
    }
    /**
     * Test findItemById.
     * проверяет нахождение заявки по Id.
     */
    @Test
    public void whenUserFindItemByIdThenTrackerShowItemWithThisId() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test", "Desc", 123L));
        Input input = new StubInput(new String[]{"4", item.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()), is(item));
    }
    /**
     * Test findItemByName.
     * проверяет нахождение заявки по названию.
     */
    @Test
    public void whenUserFindItemByNameThenTrackerShowItemsWithThisName() {
        Tracker tracker = new Tracker();
        Item first = tracker.add(new Item("test1", "Desc1", 123L));
        Item second = tracker.add(new Item("test2", "Desc2", 1234L));
        Item third = tracker.add(new Item("test1", "Desc1", 123L));
        Input input = new StubInput(new String[]{"5", third.getName(), "6"});
        new StartUI(input, tracker).init();
        Item[] expected = {first, third};
        assertThat(tracker.findByName(first.getName()), is(expected));
    }
}
