package org.example;

public class Message {
    String phoneNumber;
    String messageContent;

    public Message(String phoneNumber, String messageContent) {
        this.phoneNumber = phoneNumber;
        this.messageContent = messageContent.length() > 500 ? messageContent.substring(0, 500) : messageContent;
    }

    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public java.lang.String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(java.lang.String messageContent) {
        this.messageContent = messageContent;
    }
}