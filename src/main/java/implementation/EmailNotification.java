package implementation;
import interface.notificationservice;

public class EmailNotification implements notificationservice{
    @Override
    public void sendnotification(String message){
        System.out.println("Email sent"+message);

    }
    
}
