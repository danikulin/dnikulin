package ru.job4j.search;

import java.util.HashMap;
import java.util.List;
/**
 * UserConvert.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 11.09.2018
 */
public class UserConvert {
    /**
     * Метод process.
     * Переводит листUsers в Map.
     * @param list лист содержащий Users.
     * @return Map содержащий User.
     */
    public HashMap<Integer, Users> process(List<Users> list) {
        HashMap<Integer, Users> result = new HashMap<>();
        for (Users user : list) {
            result.put(user.getId(), user);
        }
        return result;
    }
}
