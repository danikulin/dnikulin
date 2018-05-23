package ru.job4j.tracker;
/**
 * MenuTracker
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 25.04.2018
 */
/**
 * Exit
 * Внешний класс для выхода из программы.
 */
class Exit extends BaseAction {
    public Exit(int key, String name) {
        super(key, name);
    }
    public void execute(Input input, Tracker tracker) {
    }
}
public class MenuTracker {
    /**
     * Получение данных от пользователя.
     */
    private Input input;
    /**
     * Хранилище заявок.
     */
    private Tracker tracker;
    /**
     * Массив для действий пользователя.
     */
    private UserAction[] actions = new UserAction[7];
    int position = 0;
    /**
     * Конструктор MenuTracker.
     *
     * @param input   данные от пользователя.
     * @param tracker данные из хранилища заявок.
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    /**
     * fellAction
     * Инициализирует массив действий пользователя.
     */
    public void feelAction() {
        actions[position++] = this.new AddItem(0, "Add new item");
        actions[position++] = this.new ShowAll(1, "Show all items");
        actions[position++] = new MenuTracker.EditItem(2, "Edit item");
        actions[position++] = this.new DelItem(3, "Delete item");
        actions[position++] = this.new FindItemID(4, "Find item by Id");
        actions[position++] = this.new FindItemName(5, "Find items by name");
        actions[position++] = new Exit(6, "Exit program");
    }
    /**
     * index.
     * Определяет количество пунктов меню.
     */
    public int[] index() {
        int[] rang = new int[actions.length];
        for (int i = 0; i != actions.length; i++) {
            rang[i] = i;
        }
        return rang;
    }
    /**
     * select.
     * Запускает выполнение выбранного действия.
     *
     * @param key номер действия.
     */
    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    /**
     * show
     * Выводит меню в консоль.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }
    /**
     * Класс AddItem.
     * Добавляет заявку в систему.
     */
    private class AddItem extends BaseAction {
        public AddItem(int key, String name) {
            super(key, name);
        }
        public void execute(Input input, Tracker tracker) {
            System.out.println("Добавление новой заявки");
            String name = input.ask("Введите название заявки : ");
            String desc = input.ask("Введите описание : ");
            Long create = System.currentTimeMillis();
            Item item = new Item(name, desc, create);
            tracker.add(item);
            System.out.println("Новая заявка с Id : " + item.getId());
        }
    }
    /**
     * Класс ShowAll.
     * Выводит все заявки в консоль.
     */
    private class ShowAll extends BaseAction {
        public ShowAll(int key, String name) {
            super(key, name);
        }

        public void execute(Input input, Tracker tracker) {
            Item[] items = tracker.findAll();
            System.out.println("Список заявок");
            if (items.length == 0) {
                System.out.println("Список заявок пуст");
            }
            for (Item item : items) {
                if (item != null) {
                    System.out.println(item.getName() + " Id: " + item.getId() + " Desc: " + item.getDesc());
                }
            }
        }
    }
    /**
     * Класс EditItem.
     * Изменяет заявку в системе.
     */
    private static class EditItem extends BaseAction {
        public EditItem(int key, String name) {
            super(key, name);
        }
        public void execute(Input input, Tracker tracker) {
            System.out.println("Изменение заявки");
            String id = input.ask("Введите Id заявки : ");
            if (tracker.findById(id) == (null)) {
                System.out.println("Заявка с таким Id не найдена");
            } else {
                String name = input.ask("Введите новое название заявки : ");
                String desc = input.ask("Введите новое описание : ");
                Long create = System.currentTimeMillis();
                Item item = new Item(name, desc, create);
                item.setId(id);
                tracker.replace(id, item);
                System.out.println("Заявка изменена.");
            }
        }
    }
    /**
     * Класс DelItem.
     * Удоляет заявку из системы.
     */
    private class DelItem extends BaseAction {
        public DelItem(int key, String name) {
            super(key, name);
        }
        public void execute(Input input, Tracker tracker) {
            System.out.println("Удаление заявки.");
            String id = input.ask("Введите Id заявки : ");
            if (tracker.findById(id) == (null)) {
                System.out.println("Заявка с таким Id не найдена");
            } else {
                tracker.delete(id);
                System.out.println("Заявка с Id : " + id + " удалена");
            }
        }
    }
    /**
     * Класс FindItemID.
     * Находит заявку в системе по ID.
     */
    private class FindItemID extends BaseAction {
        public FindItemID(int key, String name) {
            super(key, name);
        }
        public void execute(Input input, Tracker tracker) {
            System.out.println("Поиск заявки по Id.");
            String id = input.ask("Введите Id заявки : ");
            Item item = tracker.findById(id);
            if (item != null) {
                System.out.println("Заявка с Id :" + id + " " + item.getName());
            } else {
                System.out.println("Заявка с таким Id не найдена");
            }
        }
    }
    /**
     * Класс FindItemName.
     * Находит заявку в системе по имени.
     */
    private class FindItemName extends BaseAction {
        public FindItemName(int key, String name) {
            super(key, name);
        }
        public void execute(Input input, Tracker tracker) {
            System.out.println("Поиск заявки по названию.");
            String name = input.ask("Введите название искомой заявки : ");
            Item[] items = tracker.findByName(name);
            System.out.println("Список заявок: ");
            if (items.length != 0) {
                for (Item item : items) {
                    if (item != null) {
                        System.out.println(item.getName() + " Id: " + item.getId() + " Desc: " + item.getDesc());
                    }
                }
            }
        }
    }
}