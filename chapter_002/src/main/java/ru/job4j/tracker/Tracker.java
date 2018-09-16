package ru.job4j.tracker;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * Tracker.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 30.03.2018
 */
public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private List<Item> items = new ArrayList<>();
    /**
     * Индекс заявки в массиве заявок.
     */
    private static final Random RN = new Random();
    /**
     * Метод add добавляет новую заявку в массив.
     * Присваевает заявке уникальный Id.
     * @param item новая заявка.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items.add(item);
        return item;
    }
    /**
     * Метод generateId генерирует уникальный Id для заявки.
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }
    /**
     * Метод replace заменяет заявку в массиве заявок.
     * @param id - уникальный номер заявки.
     * @param item - заявка.
     */
    public void replace(String id, Item item) {
        for (Item i : items) {
            if (i.getId().equals(id)) {
                items.set(items.indexOf(i), item);
            }
        }
    }
    /**
     * Метод delete - удаляет заявку из массива заявок.
     * @param id уникальный номер удоляемой заявки.
     */
    public void delete(String id) {
        int index = -1;
        for (Item i : items) {
            if (i.getId().equals(id)) {
                index = items.indexOf(i);
            }
        }
        if (index != -1) {
            items.remove(index);
        }
    }
    /**
     * Метод findAll возвращает все заявки которые есть в массиве заявок.
     */
    public List<Item> findAll() {
        return items;
    }
    /**
     * Метод findByName ищет заявки в массиве заявок по имени.
     * @param key - имя заявки.
     * @return массив заявок с именами соответствующими key.
     */
    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        for (Item i : items) {
            if (i.getName().equals(key)) {
                result.add(i);
            }
        }
        return result;
    }
    /**
     * Метод findById находит заявку по Id.
     * @param id - номер искомой заявки.
     * @return - заявку.
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (id.equals(item.getId())) {
                result = item;
                break;
            }
        }
        return result;
    }
}
