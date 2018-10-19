package ru.job4j.bank;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/**
 * Bank.
 *
 * @author Dmitriy Nikulin (nikos-dima@mail.ru)
 * @version 1.1
 * @since 08.10.2018
 */
public class Bank {
    /**
     * Хранилище пользователей и их аккаунтов.
     */
    private TreeMap<User, ArrayList<Account>> bank = new TreeMap<>();

    /**
     * Метод addUser.
     * Добавляет нового пользователя в мап хранилище.
     * @param user пользователь которого надо добавить.
     */
    public void addUser(User user) {
        this.bank.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод deleteUser.
     * Удоляет пользователя из хранилища.
     * @param user пользователь которого надо удалить.
     */
    public void deleteUser(User user) {
        this.bank.remove(user);
    }

    /**
     * Метод addAccountToUser.
     * Добавляет аккаунт юзеру.
     * @param passport паспортные данные юзера, которому нужно добавить аккаунт.
     * @param account аккаунт который надо добавить.
     */
    public void addAccountToUser(String passport, Account account) {
        Set<User> user = this.bank.navigableKeySet();
        for (User u : user) {
            if (u.getPassport().equals(passport)) {
                this.bank.get(u).add(account);
                break;
            }
        }
    }

    //private Account getActualAccount(User user, Account account) {
   //     ArrayList<Account> list = this.treemap.get(user);
   //     return list.get(list.indexOf(account));
   // }

    /**
     * Метод deleteAccountFromUser.
     * Удоляет аккаунт у юзера.
     * @param passport паспортные данные юзера, у которого нужно удалить аккаунт.
     * @param account аккаунт который нужно удолить.
     */
    public void deleteAccountFromUser(String passport, Account account) {
        Set<User> user = this.bank.navigableKeySet();
        for (User u : user) {
            if (u.getPassport().equals(passport)) {
                this.bank.get(u).remove(account);
                break;
            }
        }
    }

    /**
     * Метод getUserAccounts.
     * Возвращает список аккаунтов пользователя.
     * @param passport паспортные данные пользователя.
     */
    public List<Account> getUserAccounts(String passport) {
        List<Account> list = new ArrayList<>();
        Set<User> user = this.bank.navigableKeySet();
        for (User u : user) {
            if (u.getPassport().equals(passport)) {
                list = this.bank.get(u);
                break;
            }
        }
        return list;
    }

    /**
     * Метод transferMany.
     * Переводит деньги между счетами одного пользователя или на счет другому пользователю.
     * @param srcPassport паспортные данные пользователя который переводит деньги.
     * @param srcRequisites реквезиты аккаунта с которого переводятся деньги.
     * @param destPassport паспортные данные пользователя, которому переводятся деньги.
     * @param destRequisites реквезиты аккаунта на который переводятся деньги.
     * @param amount количество денег, которое надо перевести.
     * @return truth - если перевод выполнен успешно, false - если перевод не выполнен.
     */
    public boolean transferMany(String srcPassport, String srcRequisites, String destPassport, String destRequisites, double amount) {
        return this.bank.get(user1).contains(account1)
                && this.bank.get(user2).contains(account2)
                && getActualAccount(user1, account1).transfer(
                getActualAccount(user2, account2), amount);
    }

    //public String toString() {
      //  return "Bank{" + "accounts=" + treemap + "}";
    //}
}