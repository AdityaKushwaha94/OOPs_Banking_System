package models;

public class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.04;

    public SavingsAccount(int account_no, User user) {
        super(account_no, user);
    }

    @Override
    public void calculateinterest() {
        balance += balance * INTEREST_RATE;
    }
}
