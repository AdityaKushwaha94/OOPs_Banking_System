package models;

import java.time.LocalDateTime;

public class Transaction {
    private final int transactionId;
    private final int accountNumber;
    private final String type; // "DEPOSIT", "WITHDRAW", "TRANSFER"
    private final double amount;
    private final LocalDateTime timestamp;

    public Transaction(int transactionId, int accountNumber, String type, double amount) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    public int getTransactionId() {
        return transactionId;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getDetails() {
        return "Transaction ID: " + transactionId + 
               ", Account: " + accountNumber + 
               ", Type: " + type + 
               ", Amount: " + amount + 
               ", Time: " + timestamp;
    }
}
