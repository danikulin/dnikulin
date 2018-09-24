package ru.job4j.sort;
/**
 * UserSort.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 24.09.2018
 */
import java.util.List;
import java.util.TreeSet;

public class UserSort {
    /**
     * Метод sort.
     * Заполняет TreeSet User объектами User отсортированными в порядке возростания по возрасту.
     * @param users лист содержащий не отсартированных User.
     * @return TreeSet User отсортированных в порядке возростания по возрасту.
     */
    public TreeSet<User> sort(List<User> users) {
        TreeSet<User> result = new TreeSet<User>();
        result.addAll(users);
        return result;
    }
}
