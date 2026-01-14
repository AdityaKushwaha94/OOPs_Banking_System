package services;

import models.Transaction;
import java.util.ArrayList;
import java.util.List;

public class TransactionService {

    private final List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void showTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t.getDetails());
        }
    }
}
