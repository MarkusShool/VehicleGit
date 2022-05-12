package com.company;

public class Vehicle {

    protected int seats;

    protected String fuel;

    protected int weels;

    protected String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String value) {
        brand = value;
    }

    public String getModel() {
        // TODO implement here
        return "";
    }

    public void setModel(String value) {
        // TODO implement here
    }

    /**
     * In dieser Methode wird brake ausgegeben.
     */
    public void brake() {

        System.out.println("Brake");
    }

    public void drive() {

    }

    @Deprecated
    private void refuel() {

        System.out.println("Refuel");
    }

}