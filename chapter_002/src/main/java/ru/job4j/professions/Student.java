package ru.job4j.professions;
/**
 * Student.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.2
 * @since 27.03.2018
 */
public class Student {
    Teacher techer = new Teacher("name");
    String name = techer.getName();
    String zachet = techer.teach();
}
