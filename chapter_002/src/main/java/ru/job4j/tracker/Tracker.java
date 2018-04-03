package ru.job4j.tracker;
import java.util.Arrays;
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
    private Item[] items = new Item[100];
    /**
     * Индекс заявки в массиве заявок.
     */
    private int position = 0;
    private static final Random RN = new Random();
    /**
     * Метод add добавляет новую заявку в массив.
     * Присваевает заявке уникальный Id.
     * @param item новая заявка.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
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
        for (int i = 0; i != items.length; i++) {
            if (items[i] != null && items[i].getId().equals(id)) {
                items[i] = item;
                break;
            }
        }
    }
    /**
     * Метод delete - удаляет заявку из массива заявок.
     * @param id уникальный номер удоляемой заявки.
     */
    public void delete(String id) {
        for (int i = 0; i != items.length; i++) {
            if (items[i] != null && items[i].getId().equals(id)) {
                for (int j = i; j != 0; j--) {
                    items[j] = items[j - 1];
                }
                System.arraycopy(items, 1, items, 0, 99);
            }
        }
    }
    /**
     * Метод findAll возвращает все заявки которые есть в массиве заявок.
     */
    public Item[] findAll() {
        Item[] result = new Item[this.position];
        for (int index = 0; index != this.position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }
    /**
     * Метод findByName ищет заявки в массиве заявок по имени.
     * @param key - имя заявки.
     * @return массив заявок с именами соответствующими key.
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[this.position];
        int i = 0;
            for (int index = 0; index != this.position; index++) {
                if (this.items[index].getName().equals(key)) {
                    result[i] = this.items[index];
                    i++;
                }
            }
        return Arrays.copyOf(result, i);
    }
    /**
     * Метод findById находит заявку по Id.
     * @param id - номер искомой заявки.
     * @return - заявку.
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && id.equals(item.getId())) {
               result = item;
               break;
            }
        }
        return result;
    }
}
