package models;

public abstract class Account {
    protected int account_no;
    protected double balance;
    protected User user;
    
    public Account(int account_no, User user){
        this.account_no=account_no;
        this.balance=0;
        this.user=user;

    }
    public abstract void calculateinterest();

    public void deposit(double amount){
        balance=amount+balance;
    }
    public void withdraw(double amount){
        if(amount>balance){
            throw new RuntimeException("insufficient balacne");
        }
        
            balance=balance-amount;
        
    }
    public double getbalance(){
        return balance;
    }
    public int getaccount(){
return account_no;
    }

    
}
