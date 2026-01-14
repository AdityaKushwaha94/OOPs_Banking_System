package services;

import interfaces.NotificationService;

public class BankService {

    private final NotificationService notificationService;

    public BankService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String message) {
        notificationService.sendNotification(message);
    }
}
