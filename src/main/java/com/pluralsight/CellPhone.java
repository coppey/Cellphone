package com.pluralsight;

public class CellPhone
{
    //Data
    private String phoneNumber;
    private String model;
    private String carrier;
    private String owner;
    private int serialNumber;

    //constructor
    public CellPhone(){
        this.phoneNumber = "";
        this.model = "";
        this.carrier = "";
        this.owner = "";
        this.serialNumber = 0;
    }

    public CellPhone(
            int serialNumber,
            String phoneNumber,
            String model,
            String carrier,
            String owner)
    {

        this.serialNumber = serialNumber;
        this.phoneNumber = phoneNumber;
        this.model = model;
        this.carrier = carrier;
        this.owner = owner;

    }

    public CellPhone(
            String carrier,
            String model,
            String owner,
            String phoneNumber,
            int serialNumber)
    {
        this.carrier = carrier;
        this.model = model;
        this.owner = owner;
        this.phoneNumber = phoneNumber;
        this.serialNumber = serialNumber;
    }

    //getter


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "carrier='" + carrier + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", model='" + model + '\'' +
                ", owner='" + owner + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }
}
