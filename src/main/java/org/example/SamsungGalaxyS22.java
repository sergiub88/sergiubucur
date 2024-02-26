package org.example;

public class SamsungGalaxyS22 extends Phone {
    public SamsungGalaxyS22(String color, String material, String IMEI) {
        super(color, material, IMEI, 24);
    }

    @Override
    public void addContact(String id, String phoneNumber, String firstName, String lastName) {
        contacts.put(id, new Contact(id, phoneNumber, firstName, lastName));
    }

    @Override
    public void sendMessage(String phoneNumber, String messageContent) {
        if (batteryLife > 0) {
            messages.add(new Message(phoneNumber, messageContent));
            batteryLife -= 1;
        }
    }

    @Override
    public void call(String phoneNumber) {
        if (batteryLife >= 2) {
            calls.add(new Call(phoneNumber));
            batteryLife -= 2;
        }
    }

    @Override
    public void viewHistory() {

    }
}