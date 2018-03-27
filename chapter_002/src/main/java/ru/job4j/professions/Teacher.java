package ru.job4j.professions;
/**
 * Teacher.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.2
 * @since 27.03.2018
 */
public class Teacher extends Profession {
    public String zachet;
    public Teacher(String name) {
        this.name = name;
    }
    /**
     * @return zachet.
     */
    public String teach() {
        return zachet;
    }
}
