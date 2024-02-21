package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Phone samsungGalaxyS22 = new SamsungGalaxyS22("Negru", "Plastic", "IMEI123456789");


        samsungGalaxyS22.addContact("1", "0749071516", "Sergiu" , "Bucur");
        samsungGalaxyS22.addContact("2", "0749999999", "Maria", "Varga");


        samsungGalaxyS22.sendMessage("0712345678", "Salut! Ce faci?");


        samsungGalaxyS22.call("0749071516");


        samsungGalaxyS22.viewHistory();



    }
}
