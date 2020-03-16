package org.fasttrackit;

public class Vehicle
{
    //instance variables
    int racingNumber;
    String name;
    int maxSpeed;
    double mileage;
    String color;
    double fuelLevel;
    double totalDistance;
    boolean damaged;


    public double accelerate(double speed, double durationInHours)
    {
        if(fuelLevel<=0)
        {
            System.out.println("Not enough fuel");
            return 0;
        }
        if(speed> maxSpeed) {
            System.out.println(name + "is accelerating with" + speed + "in km / h " + durationInHours + "h");
            return 0;
        }
        else if(speed==maxSpeed){
            System.out.println("Carefull ! Max speed reached!");

        }
        else
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



        double usedFuel = travelDistance * mileage / 100 ;
        usedFuel *= mileageMultiplier;
        fuelLevel = fuelLevel - usedFuel;

//        fuelLevel -= usedFuel;

        System.out.println("Remaining fuel" + fuelLevel);

        return travelDistance;
    }
    public void decelerate(){
        //TODO :implement this
        System.out.println("This is just a demo method");

    }
}
