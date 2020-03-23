package org.fasttrackit;

public class CheatingVehicle extends Vehicle {
    public static final String TYPE = "CHEATER";
    @Override
    public double accelerate(double speed, double durationInHours) {
        System.out.println(getName() + "is accelarating with" + speed + "for" + durationInHours + "h.");

        double distance = 2 * speed * durationInHours;
        setTotalDistance(getTotalDistance() + distance);

        System.out.println("CHEATER!!!");
        return distance;
    }
    public CheatingVehicle clone(){
        return new CheatingVehicle();
    }
}
