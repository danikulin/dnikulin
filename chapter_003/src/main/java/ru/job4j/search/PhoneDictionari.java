package ru.job4j.search;
import java.util.ArrayList;
import java.util.List;
/**
 * PhoneDictionari.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.2
 * @since 06.08.2018
 */
public class PhoneDictionari {
    private List<Person> persons = new ArrayList<Person>();
    /**
     * Метод add.
     * Добавляет человека в телефонный справочник.
     * @param person человек которого нужно добавить.
     */
    public void add(Person person) {
        this.persons.add(person);
    }
    /**
     * Метод find.
     * Ищет человека в телефонном справочнике.
     * @param key ключь по которому надо искать.
     * @return всех людей соответствующих ключу.
     */
    public List<Person> find(String key) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getName().contains(key)
                    || person.getSurname().contains(key)
                    || person.getPhone().contains(key)
                    || person.getAddress().contains(key)) {
                result.add(person);
            }
        }
        return result;
    }
}
