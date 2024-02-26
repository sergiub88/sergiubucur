package org.example;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public abstract class Phone {
    protected int batteryLife;
    protected final String color;
    protected final String material;
    protected final String IMEI;
    protected Map<String, Contact> contacts = new HashMap<>();
    protected List<Message> messages = new ArrayList<>();
    protected List<Call> calls = new ArrayList<>();

    public Phone(String color, String material, String IMEI, int batteryLife) {
        this.color = color;
        this.material = material;
        this.IMEI = IMEI;
        this.batteryLife = batteryLife;
    }

    public abstract void addContact(String id, String phoneNumber, String firstName, String lastName);
    public abstract void sendMessage(String phoneNumber, String messageContent);
    public abstract void call(String phoneNumber);
    public abstract void viewHistory();


}
