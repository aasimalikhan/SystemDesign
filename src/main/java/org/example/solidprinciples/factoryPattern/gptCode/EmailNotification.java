package org.example.solidprinciples.factoryPattern.gptCode;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Send email notification");
    }
}
