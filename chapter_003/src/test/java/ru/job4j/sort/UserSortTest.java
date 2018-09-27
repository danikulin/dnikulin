package ru.job4j.sort;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * UserSortTest.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 24.09.2018
 */
public class UserSortTest {
    /**
     * Test sort.
     * Проверяет, что первый элемент TreeSet пользователей, соответствует наименьшиму по возрасту.
     */
    @Test
    public void whenNotSortListThenSortSet() {
        UserSort usort = new UserSort();
        TreeSet<User> result = usort.sort(Arrays.asList(new User("Pitr", 20), new User("Ivan", 18), new User("Jon", 19)));
        assertThat(result.first().getName(), is("Ivan"));
    }
    /**
     * Test sortNameLengts.
     * Проверяет, что первый элемент отсортированной коллекции наименьший по длине имени.
     */
    @Test
    public void whenNotSortListThenSortNmaeLenght() {
        UserSort usort = new UserSort();
        List<User> result = usort.sortNameLengts(Arrays.asList(new User("Пётр", 20), new User("Артур", 18), new User("Коля", 19), new User("Эллионора", 25)));
        for (User u : result) {
            System.out.println(u.getName());
        }
        assertThat(result.get(0).getName(), is("Пётр"));
    }
    /**
     * Test sortNameLengts.
     * Проверяет, что первый элемент отсортированной коллекции отсортирован в лексикографическом порядке и имеет наименьший возраст.
     */
    @Test
    public void whenNotSortListThenSortByAllFilds() {
        UserSort usort = new UserSort();
        List<User> result = usort.sortByAllFields(Arrays.asList(new User("Пётр", 20), new User("Артур", 18), new User("Коля", 19), new User("Артур", 17)));
        for (User u : result) {
            System.out.println(u.getName() + " " + u.getAge());
        }
        assertThat(result.get(0).getName(), is("Артур"));
    }
}
