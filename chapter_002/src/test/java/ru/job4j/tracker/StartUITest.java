package ru.job4j.tracker;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * StartUITest.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.2
 * @since 18.04.2018
 */
public class StartUITest {
    private final Tracker tracker = new Tracker();
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    /**
     * loadOutput.
     * Переводит вывод в консоль в байт массив перед началом теста.
     */
    @Before
    public void loadOutput() {
        System.out.println("Execute before metod");
        System.setOut(new PrintStream(this.out));
    }
    /**
     * backOutput.
     * Возвращает вывод в консоль.
     */
    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("Execute after metod");
    }
    /**
     * Test createNewItem.
     * Проверяет создание новой заявки.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name"));
    }
    /**
     * Test findAllItems.
     * Проверяет показ всех заявок.
     */
    @Test
    public void whenUserFindAllItemsTrackerShowAllItems() {
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
        Item item = tracker.add(new Item("test", "Desc", 123L));
        Input input = new StubInput(new String[]{"2", item.getId(), "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test name"));
    }
    /**
     * Test delItem.
     * проверяет удаление заявки.
     */
    @Test
    public void whenUserDeleteItemThenTrackerNotHasItem() {
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
        Item first = tracker.add(new Item("test1", "Desc1", 123L));
        Item second = tracker.add(new Item("test2", "Desc2", 1234L));
        Item third = tracker.add(new Item("test1", "Desc1", 123L));
        Input input = new StubInput(new String[]{"5", third.getName(), "6"});
        new StartUI(input, tracker).init();
        Item[] expected = {first, third};
        assertThat(tracker.findByName(first.getName()), is(expected));
    }
    /**
     * Test ShowMenu.
     * Проверяет вывод меню в консоль при запуске программы.
     */
    @Test
    public void whenUserStartThenTrackerShowMenu() {
        Input input = new StubInput(new String[]{"6"});
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is((new StringBuilder().append("Меню.")
                .append(System.lineSeparator())
                .append("0. Add new item")
                .append(System.lineSeparator())
                .append("1. Show all items")
                .append(System.lineSeparator())
                .append("2. Edit item")
                .append(System.lineSeparator())
                .append("3. Delete item")
                .append(System.lineSeparator())
                .append("4. Find item by Id")
                .append(System.lineSeparator())
                .append("5. Find items by name")
                .append(System.lineSeparator())
                .append("6. Exit program")
                .append(System.lineSeparator())
                .toString())));
    }
    /**
     * Test findAll.
     * проверяет вывод в консоль всех заявок.
     */
    @Test
    public void whenUserChous1ThenTrackerShowAllItems() {
        Item first = tracker.add(new Item("test1", "Desc1", 123L));
        Item second = tracker.add(new Item("test2", "Desc2", 1234L));
        Input input = new StubInput(new String[]{"1", "6"});
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is((new StringBuilder().append("Меню.")
                .append(System.lineSeparator())
                .append("0. Add new item")
                .append(System.lineSeparator())
                .append("1. Show all items")
                .append(System.lineSeparator())
                .append("2. Edit item")
                .append(System.lineSeparator())
                .append("3. Delete item")
                .append(System.lineSeparator())
                .append("4. Find item by Id")
                .append(System.lineSeparator())
                .append("5. Find items by name")
                .append(System.lineSeparator())
                .append("6. Exit program")
                .append(System.lineSeparator())
                .append("Список заявок")
                .append(System.lineSeparator())
                .append(first.getName() + " Id: " + first.getId() + " Desc: " + first.getDesc())
                .append(System.lineSeparator())
                .append(second.getName() + " Id: " + second.getId() + " Desc: " + second.getDesc())
                .append(System.lineSeparator())
                .append("Меню.")
                .append(System.lineSeparator())
                .append("0. Add new item")
                .append(System.lineSeparator())
                .append("1. Show all items")
                .append(System.lineSeparator())
                .append("2. Edit item")
                .append(System.lineSeparator())
                .append("3. Delete item")
                .append(System.lineSeparator())
                .append("4. Find item by Id")
                .append(System.lineSeparator())
                .append("5. Find items by name")
                .append(System.lineSeparator())
                .append("6. Exit program")
                .append(System.lineSeparator())
                .toString())));
    }
    /**
     * Test FindItemById.
     * Проверяет вывод в консоль заявки, найденной по Id.
     */
    @Test
    public void whenUserChous4ThenTrackerShowThisItem() {
        Item item = tracker.add(new Item("test", "Desc", 123L));
        Input input = new StubInput(new String[]{"4", item.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is((new StringBuilder().append("Меню.")
                .append(System.lineSeparator())
                .append("0. Add new item")
                .append(System.lineSeparator())
                .append("1. Show all items")
                .append(System.lineSeparator())
                .append("2. Edit item")
                .append(System.lineSeparator())
                .append("3. Delete item")
                .append(System.lineSeparator())
                .append("4. Find item by Id")
                .append(System.lineSeparator())
                .append("5. Find items by name")
                .append(System.lineSeparator())
                .append("6. Exit program")
                .append(System.lineSeparator())
                .append("Поиск заявки по Id.")
                .append(System.lineSeparator())
                .append("Заявка с Id :" + item.getId() + " " + item.getName())
                .append(System.lineSeparator())
                .append("Меню.")
                .append(System.lineSeparator())
                .append("0. Add new item")
                .append(System.lineSeparator())
                .append("1. Show all items")
                .append(System.lineSeparator())
                .append("2. Edit item")
                .append(System.lineSeparator())
                .append("3. Delete item")
                .append(System.lineSeparator())
                .append("4. Find item by Id")
                .append(System.lineSeparator())
                .append("5. Find items by name")
                .append(System.lineSeparator())
                .append("6. Exit program")
                .append(System.lineSeparator())
                .toString())));
    }
}
