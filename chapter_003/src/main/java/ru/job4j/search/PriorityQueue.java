package ru.job4j.search;
import java.util.LinkedList;
/**
 * PriorityQueue.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 08.08.2018
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();
    /**
     * Метод put.
     * Добавляет задачи в очередь в соответствии с приоритетом.
     * @param task задача, которую надо добавить.
     */
    public void put(Task task) {
        if (!tasks.isEmpty()) {
            int index = tasks.size();
            for (Task t : tasks) {
                if (task.getPriority() < t.getPriority()) {
                    index = tasks.indexOf(t);
                    break;
                }
            }
            tasks.add(index, task);
        }
        tasks.add(task);
    }
    /**
     * Метод take.
     * @return первую задачу из списка.
     */
    public Task take() {
        return this.tasks.poll();
    }
}


