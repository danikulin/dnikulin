package ru.job4j.professions;
/**
        * Profession
        *
        * @author Dmitriy Nikulin (nikos-dima@mail.ru)
        * @version 1.1
        * @since 26.03.2018
        */
public class Profession {
    public String name;
    public Profession() {
    }
    public Profession(String name) {
        this.name = name;
    }
    /**
     * @return name.
     */
    public String getName() {
        return this.name;
    }
}
