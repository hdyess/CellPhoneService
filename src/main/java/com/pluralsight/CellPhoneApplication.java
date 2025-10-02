package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CellPhoneApplication {

    private Scanner getInput = new Scanner(System.in);

    public static void main(String[] args) {
        
        CellPhone myPhone = new CellPhone();

        System.out.println("What is the serial number?");
        int serialNumber = getInput.nextInt();
        myPhone.setSerialNumber(serialNumber);
        getInput.nextLine();

        System.out.println("What is the model?");
        String model = getInput.nextLine();
        myPhone.setModel(model);

        System.out.println("What is the carrier?");
        String carrier = getInput.nextLine();
        myPhone.setCarrier(carrier);

        System.out.println("What is the phone number?");
        String phoneNumber = getInput.nextLine();
        myPhone.setPhoneNumber(phoneNumber);

        System.out.println("Who is the owner?");
        String owner = getInput.nextLine();
        myPhone.setOwner(owner);


        display(myPhone);

        System.out.println("What number do you want to dial?");
        myPhone.dial(getInput.nextLine());






    }

    private static void display(CellPhone phone) {
        System.out.println("-----------------------");
        System.out.printf("CELL PHONE [SN:%d]\n", phone.getSerialNumber());
        System.out.printf("    OWNER: %s\n", phone.getOwner());
        System.out.printf("    MODEL: %s\n", phone.getModel());
        System.out.printf("    CARRIER: %s\n", phone.getCarrier());
        System.out.printf("    NUMBER: %s\n", phone.getPhoneNumber());
        System.out.println("-----------------------");
    }


}
