package com.pluralsight;

public class CellPhone {

    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone() {

        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";

    }

    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner) {

        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;

    }

    //serial
    public int getSerialNumber(){
        return serialNumber;
    }
    public void setSerialNumber(int newSerialNumber){
        this.serialNumber = newSerialNumber;
    }

    //model
    public String getModel(){
        return this.model;
    }
    public void setModel(String newModel){
        this.model = newModel;
    }

    //carrier
    public String getCarrier(){
        return this.carrier;
    }
    public void setCarrier(String newCarrier){
        this.carrier = newCarrier;
    }

    // phone number
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String newPhoneNumber){
        this.phoneNumber = newPhoneNumber;
    }

    //owner
    public String getOwner(){
        return this.owner;
    }
    public void setOwner(String newOwner){
        this.owner = newOwner;
    }

    //calling
    public void dial(String phoneNumberToCall) {
        System.out.println(owner + "'s Phone (" + phoneNumber + ") is calling " + phoneNumberToCall);
        System.out.println("Ring!\nRing!\nRing!\n");
    }



}
