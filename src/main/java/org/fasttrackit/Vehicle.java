package org.fasttrackit;

import com.sun.org.apache.bcel.internal.generic.PUSH;

public class Vehicle {
    public static int getTotalVehicleCount() {
        return totalVehicleCount;
    }

    //static variables ( class variables)
    private static int totalVehicleCount;

    //instance variables
    private int racingNumber;
    private String name;
    private int maxSpeed;
    private double mileage;
    private String color;
    private double fuelLevel;
    private double totalDistance;
    private boolean damaged;


    public Vehicle() {
        totalVehicleCount++;
    }

    //method overloading
    public double accelerate(double speed) {
        return accelerate(speed, 1);
    }

    public double accelerate(double speed, double durationInHours) {
        if (fuelLevel <= 0) {
            System.out.println("Not enough fuel");
            return 0;
        }
        if (speed > maxSpeed) {
            System.out.println(name + "is accelerating with" + speed + "in km / h " + durationInHours + "h");
            return 0;
        } else if (speed == maxSpeed) {
            System.out.println("Carefull ! Max speed reached!");

        } else
            System.out.println("Valid speed entered");
        double mileageMultiplier = 1;
        if (speed > 120) {
            mileageMultiplier = speed / 100;
        }
        //local variables
        double travelDistance = speed * durationInHours;

        System.out.println("Travel distance :" + travelDistance);

        totalDistance += travelDistance;
        System.out.println("Total traveled distance" + totalDistance);


        double usedFuel = travelDistance * mileage / 100;
        usedFuel *= mileageMultiplier;
        fuelLevel = fuelLevel - usedFuel;

//        fuelLevel -= usedFuel;

        System.out.println("Remaining fuel" + fuelLevel);

        return travelDistance;
    }

    public void decelerate() {
        //TODO :implement this
        System.out.println("This is just a demo method");

        //co-variant return type
        protected Vehicle clone(){
            return new Vehicle();
        }
    }
    //write only
    public void setName(String name){
        this.name = name;
    }
    //read only
    public String getName(){
        return this.name;
    }

    public int getRacingNumber() {
        return racingNumber;
    }

    public void setRacingNumber(int racingNumber) {
        this.racingNumber = racingNumber;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public boolean isDamaged() {
        return damaged;
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "racingNumber=" + racingNumber +
                ", name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", mileage=" + mileage +
                ", color='" + color + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", totalDistance=" + totalDistance +
                ", damaged=" + damaged +
                '}';
    }
}

