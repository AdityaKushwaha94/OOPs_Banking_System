import models.User;
import models.SavingsAccount;

class notice{
    public String name="aditua";
    public notice(){
        System.out.println("name"+name);
    }
}

public class Main {
    public static void main(String[] args){
        User u=new User(1,"aditya","hello@example.com","1234567890");
        System.out.println("User created: " + u.getName());
        
        SavingsAccount account = new SavingsAccount(101, u);
        account.deposit(1000);
        System.out.println("Initial balance: " + account.getbalance());
        
        account.calculateinterest();
        System.out.println("Balance after interest: " + account.getbalance());
        
        account.withdraw(500);
        System.out.println("Balance after withdrawal: " + account.getbalance());
    }
}
