package ru.job4j.sort;

import java.util.*;
/**
 * UserSort.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 24.09.2018
 */
public class UserSort {
    /**
     * Метод sort.
     * Заполняет TreeSet User объектами User отсортированными в порядке возростания по возрасту.
     * @param users лист содержащий не отсартированных User.
     * @return TreeSet User отсортированных в порядке возростания по возрасту.
     */
    public TreeSet<User> sort(List<User> users) {
        return new TreeSet<>(users);
    }
    /**
     * Метод sortNameLengts.
     * Сортирует входящий лист пользователей по длине имени.
     * @param users входящий лист пользователей.
     * @return лист пользователей отсортированных по длине имени
     */
    public List<User> sortNameLengts(List<User> users) {
        users.sort(new SortNameLengts());
        return  users;
    }
    /**
     * Метод sortByAllFields.
     * Сортирует входящий лист пользователей по имени в лексикографическом порядке, потом по возрасту.
     * @param users входящий лист пользователей.
     * @return лист пользователей отсортированных по имени в лексикографическом порядке и по возрасту.
     */
    public List<User> sortByAllFields(List<User> users) {
        users.sort(new SortByAllFields());
        return users;
    }
    public class SortNameLengts implements Comparator<User> {
        /**
         * Метод compare.
         * Сравнивает двух пользователей по длине имени.
         * @param o1 1-й пользователь.
         * @param o2 2-й пользователь.
         */
        @Override
        public int compare(User o1, User o2) {
            return Integer.compare(o1.getName().length(), o2.getName().length());
        }
    }
    public class SortByAllFields implements Comparator<User> {
        /**
         * Метод compare.
         * Сравнивает двух пользователей по имени и возрасту.
         * @param o1 1-й пользователь.
         * @param o2 2-й пользователь.
         */
        @Override
        public int compare(User o1, User o2) {
            int rst = o1.getName().compareTo(o2.getName());
            return rst != 0 ? rst : Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
