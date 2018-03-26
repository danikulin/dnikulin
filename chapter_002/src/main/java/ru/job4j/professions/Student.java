package ru.job4j.professions;
/**
 * Student.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 26.03.2018
 */
public class Student extends Teacher {
    public Student() {
        this.name = "Jon";
    }
    Teacher techer = new Teacher();
    String nametecher = techer.getName();
    String ball = techer.teach(name);
}
