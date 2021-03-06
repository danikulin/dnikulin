package ru.job4j.tracker;

import java.util.List;

/**
 * Input.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 06.04.2018
 */
public interface Input {
    String ask(String question);
    int ask(String question, List<Integer> rang);
}

