package org.fasttrackit;

public class Mechanic {
    public void repair(Vehicle vehicle) {
        System.out.println("repairing vehicle" + vehicle.name);

        vehicle.totalDistance--;
        vehicle.damaged = false;


    }
}
