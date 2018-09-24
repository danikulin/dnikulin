package ru.job4j.sort;
/**
 * UserSort.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 24.09.2018
 */
import java.util.ArrayList;
import java.util.Comparator;
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
        return new TreeSet<User>(users);
    }
    public class SortNameLengts implements Comparator<User> {

        @Override
        public int compare(User o1, User o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    public void sortNameLengts(List<User> users) {
        Comparator<User> snl = new SortNameLengts();
        return new ArrayList<User>(users).sort(snl);
    }
}
