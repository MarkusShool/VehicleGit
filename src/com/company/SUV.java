package com.company;

/**
 *In dieser Klasse wir die brake Methode aufgerufen und per
 * getter/setter die Marke und PS des Fahrzeuges gesetzt und ausgegebn.
 */

public class SUV extends Vehicle {

    public static void main(String[] args){

        Vehicle suv = new Vehicle();
        Engine motor = new Engine();

        suv.brake();
        suv.setBrand("Jeep");
        System.out.println(suv.getBrand());
        motor.setHorsepower(451);
        System.out.println(motor.horsepower);
    }

    protected boolean offRoadCapability;

    public boolean getOffRoadCapability() {
        // TODO implement here
        return false;
    }

    public void setOffRoadCapability(boolean value) {
        // TODO implement here
    }

    @Override
    public void drive() {

        System.out.println("Drive");
    }


}