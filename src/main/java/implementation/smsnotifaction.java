package implementation;
import interface.notificationservice;
public class smsnotifaction implements notificationservice{
    public void smsnotifaction(String message){
        System.out.println("sMS SENT "+message);
    }

    
}
