package com.vehicle;

public class ElectricCar extends Car{
    private double batteryLevel;

    public void setBatteryLevel (double battery){
        this.batteryLevel=battery;
    }
    public double getBatteryLevel(){
        return this.batteryLevel;
    }
    public void drive (int distance){
        super.drive(distance);
        double distancekm=distance/1000.0;
        this.batteryLevel=(distancekm/10);
        this.batteryLevel=Math.max(0, this.batteryLevel);
    }
}
