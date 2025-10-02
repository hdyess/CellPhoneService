package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
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

        System.out.println("What number do you want to dial?");
        myPhone.dial(getInput.nextLine());






    }
}
