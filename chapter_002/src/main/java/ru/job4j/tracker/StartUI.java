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
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.feelAction();
        int key;
        do {
            System.out.println("Menu.");
            menu.show();
            key = Integer.valueOf(this.input.ask("Выберете пункт меню: "));
            if (key <= 6 && key >= 0) {
            menu.select(key);
            } else
                System.out.println("Вы ввели несуществующий пункт меню.");
        } while (key != 6);
    }

    public static void main(String[] args) {
        new StartUI(new ConsolInput(), new Tracker()).init();
    }
}
