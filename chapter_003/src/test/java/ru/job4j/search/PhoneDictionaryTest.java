package ru.job4j.search;

import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * PhoneDictionariTest.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 06.08.2018
 */

public class PhoneDictionaryTest {
    /**
     * Test find1.
     * Проверяет поиск по имени.
     */
    @Test
    public void whenFindeByName() {
        PhoneDictionari phone = new PhoneDictionari();
        phone.add(new Person("Dmitriy", "Nikulin", "2448244", "Moscow"));
        List<Person> persons = phone.find("Dmitriy");
        assertThat(persons.iterator().next().getSurname(), is("Nikulin"));
    }
    /**
     * Test find2.
     * Проверяет поиск по фамилии.
     */
    @Test
    public void whenFindeBySurame() {
        PhoneDictionari phone = new PhoneDictionari();
        phone.add(new Person("Dmitriy", "Nikulin", "2448244", "Moscow"));
        List<Person> persons = phone.find("Nikulin");
        assertThat(persons.iterator().next().getPhone(), is("2448244"));

    }
    /**
     * Test find3
     * Проверяет поиск по части телефона.
     */
    @Test
    public void whenFindeByPhone() {
        PhoneDictionari phone = new PhoneDictionari();
        phone.add(new Person("Dmitriy", "Nikulin", "2448244", "Moscow"));
        phone.add(new Person("Petr", "Arsentiev", "2448245", "Brynsk"));
        List<Person> persons = phone.find("45");
        assertThat(persons.iterator().next().getSurname(), is("Arsentiev"));
    }
}
