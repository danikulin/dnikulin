package ru.job4j.tracker;
/**
 * ValidateInput.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.2
 * @since 18.05.2018
 */
public class ValidateInput implements Input {
    private final Input input;
    public ValidateInput(final Input input) {
        this.input = input;
    }

    @Override
    public String ask(String question) {
        return this.input.ask(question);
    }

    public int ask(String question, int[] rang) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = this.input.ask(question, rang);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Вы ввели несуществующий пункт мею.");
            } catch (MenuOutException moe) {
                System.out.println("Вы ввели несуществующий пункт мею.");
            }
        } while (invalid);
        return value;
    }
}
