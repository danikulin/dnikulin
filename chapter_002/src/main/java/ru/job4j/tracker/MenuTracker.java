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
class Exit implements UserAction {
    public int key() {
        return 6;
    }

    public void execute(Input input, Tracker tracker) {

    }

    public String info() {
        return String.format("%s. %s", this.key(), "Exit program");
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
    /**
     * Конструктор MenuTracker.
     * @param input данные от пользователя.
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
        actions[0] = this.new AddItem();
        actions[1] = new MenuTracker.ShowAll();
        actions[2] = new MenuTracker.EditItem();
        actions[3] = this.new DelItem();
        actions[4] = this.new FindItemID();
        actions[5] = this.new FindItemName();
        actions[6] = new Exit();
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
        for (UserAction action: this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }
    /**
     * Класс AddItem.
     * Добавляет заявку в систему.
     */
    private class AddItem implements UserAction {
        public int key() {
            return 0;
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
        public String info() {
            return String.format("%s. %s", this.key(), "Add new item");
        }
    }
    /**
     * Класс ShowAll.
     * Выводит все заявки в консоль.
     */
    private static class ShowAll implements UserAction {
        public int key() {
            return 1;
        }
        public void execute(Input input, Tracker tracker) {
            Item[] items = tracker.findAll();
            System.out.println("Список заявок");
            if (items.length != 0) {
                for (Item item : items) {
                    if (item != null) {
                        System.out.println(item.getName() + " Id: " + item.getId() + " Desc: " + item.getDesc());
                    }
                }
            }
        }
        public String info() {
            return String.format("%s. %s", this.key(), "Show all items");
        }
    }
    /**
     * Класс EditItem.
     * Изменяет заявку в системе.
     */
    private static class EditItem implements UserAction {
        public int key() {
            return 2;
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
        public String info() {
            return String.format("%s. %s", this.key(), "Edit item");
        }
    }
    /**
     * Класс DelItem.
     * Удоляет заявку из системы.
     */
    private class DelItem implements UserAction {
        public int key() {
            return 3;
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
        public String info() {
            return String.format("%s. %s", this.key(), "Delete item");
        }
    }
    /**
     * Класс FindItemID.
     * Находит заявку в системе по ID.
     */
    private class FindItemID implements UserAction {
        public int key() {
            return 4;
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
        public String info() {
            return String.format("%s. %s", this.key(), "Find item by Id");
        }
    }
    /**
     * Класс FindItemName.
     * Находит заявку в системе по имени.
     */
    private class FindItemName implements UserAction {
        public int key() {
            return 5;
        }
        public void execute(Input input, Tracker tracker) {
            System.out.println("Поиск заявки по названию.");
            String name = input.ask("Введите название искомой заявки : ");
            Item[] items = tracker.findByName(name);
            System.out.println("Список заявок: ");
            if (items.length != 0) {
                for (Item item: items) {
                    if (item != null) {
                        System.out.println(item.getName() + " Id: " + item.getId() + " Desc: " + item.getDesc());
                    }
                }
            }
        }
        public String info() {
            return String.format("%s. %s", this.key(), "Find items by name");
        }
    }
}
