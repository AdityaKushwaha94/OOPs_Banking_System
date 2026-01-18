package services;

import models.SavingsAccount;
import models.User;

public class Loan extends SavingsAccount{
    private int  application_no;
    private String proof;
    private boolean isvalid=false;

    public Loan(int account_no, User user) {
        super(account_no, user);
    }

    public void takeloan(int application_no, String proof, int account_no, int balance, boolean isverified){
        if(balance > 5000 && isverified){
            System.out.println("loan can be approved");
        }
        else{
            System.out.println("rejected");
        }
    }
}
