package ru.job4j.sort;
/**
 * User.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 24.09.2018
 */
public class User implements Comparable<User> {
    private String name;
    private Integer age;
    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    /**
     * Метод compareTo.
     * Сортирует User по возрасту.
     * @param u объект класса User
     */
    @Override
    public int compareTo(User u) {
        return age.compareTo(u.getAge());
    }
}
