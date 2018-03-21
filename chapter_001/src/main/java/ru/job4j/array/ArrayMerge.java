package ru.job4j.array;
/**
 * ArrayMerge.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 21.03.2018
 */
public class ArrayMerge {
    /**
     * Метод merge.
     * Объединяет два упорядоченных по возрастанию массива в третий массив упорядоченный по возростанию.
     * @param first первый массив упорядоченный по возростанию.
     * @param second второй массив упорядоченный по возростанию.
     */
    public int[] merge(int[] first, int[] second) {
        int[] arrayresult = new int[first.length + second.length];
        int index = 0;
        for (int j = 0, i = 0; j != second.length && i != first.length;) {
            if (first[i] < second[j]) {
                arrayresult[index] = first[i];
                index++;
                i++;
            } else {
                arrayresult[index] = second[j];
                index++;
                j++;
            }
            if (i == first.length) {
                for (int k = j; k != second.length; k++) {
                    arrayresult[index] = second[k];
                    index++;
                }
                break;
            }
            if (j == second.length) {
                for (int k = i; k != first.length; k++) {
                    arrayresult[index] = first[k];
                    index++;
                }
                break;
            }
        }
        return arrayresult;
    }
}