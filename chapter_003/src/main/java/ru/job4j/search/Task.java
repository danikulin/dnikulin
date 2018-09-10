package ru.job4j.search;
/**
 * Task.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 08.08.2018
 */
public class Task {
    private String desc;
    private int priority;

    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }
    public String getDesc() {
        return desc;
    }
    public int getPriority() {
        return priority;
    }
}
