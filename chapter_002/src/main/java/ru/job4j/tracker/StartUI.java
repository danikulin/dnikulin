package ru.job4j.tracker;
/**
 * StartUI.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 06.04.2018
 */
public class StartUI {
    /**
     * Константы для пунктов меню.
     */
    private static final String ADD = "0";
    private static final String ALL = "1";
    private static final String EDIT = "2";
    private static final String DEL = "3";
    private static final String ID = "4";
    private static final String NAME = "5";
    private static final String EXIT = "6";
    /**
     * Получение данных от пользователя.
     */
    private final Input input;
    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;
    /**
     * Конструктор StartUI.
     * @param input данные от пользователя.
     * @param tracker данные из хранилища заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    /**
     * Основной цикл программы.
     */
    public void init() {
        Boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Выберете пункт меню: ");
            if (ADD.equals(answer)) {
                this.createNewItem();
            } else if (ALL.equals(answer)) {
                this.showAllItem();
            } else if (EDIT.equals(answer)) {
                this.edit();
            } else if (DEL.equals(answer)) {
                this.delItem();
            } else if (ID.equals(answer)) {
                this.findItemById();
            } else if (NAME.equals(answer)) {
                this.findItemsByName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            } else {
                System.out.println("Вы ввели несуществующий пункт меню.");
            }
        }
    }
    /**1
     * Метод createNewItem
     * Добавляет новую заявку.
     */
    private void createNewItem() {
        System.out.println("Добавление новой заявки");
        String name = this.input.ask("Введите название заявки : ");
        String desc = this.input.ask("Введите описание : ");
        Long create = System.currentTimeMillis();
        Item item = new Item(name, desc, create);
        this.tracker.add(item);
        System.out.println("Новая заявка с Id : " + item.getId());
    }
    /**
     * Метод showAllItems.
     * Выводит на консоль все заявки.
     */
    private void showAllItem() {
        Item[] items = this.tracker.findAll();
        System.out.println("Список заявок");
        if (items.length != 0) {
            for (Item item : items) {
                if (item != null) {
                    System.out.println(item.getName() + " Id: " + item.getId() + " Desc: " + item.getDesc());
                }
            }
        }
    }
    /**
     * Метод edit.
     * Реалезует изменение заявки.
     */
    private void edit() {
        System.out.println("Изменение заявки");
        String id = this.input.ask("Введите Id заявки : ");
        if (this.tracker.findById(id) == (null)) {
            System.out.println("Заявка с таким Id не найдена");
        } else {
            String name = this.input.ask("Введите новое название заявки : ");
            String desc = this.input.ask("Введите новое описание : ");
            Long create = System.currentTimeMillis();
            Item item = new Item(name, desc, create);
            item.setId(id);
            this.tracker.replace(id, item);
            System.out.println("Заявка изменена.");
        }
    }
    /**
     * Метод delItem.
     * Реализует удаление заявки.
     */
    private void delItem() {
        System.out.println("Удаление заявки.");
        String id = this.input.ask("Введите Id заявки : ");
        if (this.tracker.findById(id) == (null)) {
            System.out.println("Заявка с таким Id не найдена");
        } else {
            this.tracker.delete(id);
            System.out.println("Заявка с Id : " + id + " удалена");
        }
    }
    /**
     * Метод findItemById.
     * Реализует поиск заявки по Id.
     */
    private void findItemById() {
        System.out.println("Поиск заявки по Id.");
        String id = this.input.ask("Введите Id заявки : ");
        Item item = this.tracker.findById(id);
        if (item != null) {
            System.out.println("Заявка с Id :" + id + " " + item.getName());
        } else {
            System.out.println("Заявка с таким Id не найдена");
        }
    }
    /**
     * Метод findItemsByName.
     * Реализует поиск заявки по названию.
     */
    private void findItemsByName() {
        System.out.println("Поиск заявки по названию.");
        String name = this.input.ask("Введите название искомой заявки : ");
        Item[] items = this.tracker.findByName(name);
        System.out.println("Список заявок: ");
        if (items.length != 0) {
            for (Item item: items) {
                if (item != null) {
                    System.out.println(item.getName() + " Id: " + item.getId() + " Desc: " + item.getDesc());
                }
            }
        }
    }
    /**
     * Метод showMenu.
     * Выводит меню в консоль.
     */
    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0. Add new item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit program");
    }
    public static void main(String[] args) {
        new StartUI(new ConsolInput(), new Tracker()).init();
    }
}
