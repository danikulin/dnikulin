package ru.job4j.professions;
/**
 * Pacient.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.2
 * @since 27.03.2018
 */
public class Pacient {
    Doctor doc = new Doctor("name", "simptom");
    String name = doc.getName();
    String diagnos = doc.medicate();
}
