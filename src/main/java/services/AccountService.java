package services;

import models.Account;

public class AccountService {

    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }

    public void applyInterest(Account account) {
        account.calculateinterest();
    }
}
