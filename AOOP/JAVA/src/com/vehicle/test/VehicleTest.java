package com.vehicle.test;
import com.vehicle.Car;
import com.vehicle.ElectricCar;
public class VehicleTest {
    public  static void main(String[]args) {
        Car ferari = new Car();
        ferari.setSpeed(120);
        ferari.setFuelLevel(50);
        ferari.drive(15000);
        System.out.println("speed in Mph is" + " " + ferari.getSpeedMph());
        System.out.println("Distance Traveled in kilometers is " + " " + ferari.getDistancekm());
        System.out.println("Remaining Fuel percentage is " + " " + ferari.calculateRemainingFuel(100));

        ElectricCar Mazda = new ElectricCar();
        Mazda.setSpeed(120);
        Mazda.setBatteryLevel(60);
        Mazda.drive(25000);
        System.out.println("speed in Mph is " + " " + Mazda.getSpeedMph());
        System.out.println("Distance traveled is " + " " + Mazda.getDistancekm());
        System.out.println("Remaining Battery Level after Driving is " + " " + Mazda.getBatteryLevel());

    }

    }
