package org.fasttrackit;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App
{

    public static void main(String[] args)
    {
//        Game game = new Game();
 //       game.start();

        CheatingVehicle cheater = CheatingVehicle();
        cheater.setName("Cheater");

        cheater.accelerate(60 1) //nu este duration in hours

        System.out.println("Total distance" + cheater.getTotalDistance());

        Vehicle vehicle1 = new Vehicle();
        vehicle1.totalVehicleCount = 1;

        Vehicle vehicle2 = new Vehicle();
        vehicle2.totalVehicleCount = 2;

        Vehicle.totalVehicleCount = 50;

        System.out.println("total count from vehicle1=" + vehicle1.totalVehicleCount);
        System.out.println("total count from vehicle2=" + vehicle2.totalVehicleCount);
        System.out.println("total count from vehicle class=" + Vehicle.totalVehicleCount);

//        System.out.println("please enter vehicle name");
//        Scanner scanner = new Scanner(System.in);
//        String vehicleName = scanner.nextLine();
//
//        System.out.println("Entered name" + vehicleName);
//        System.out.println();
//
//        System.out.println("Ilona jo rucah");
//
        Engine engine1 = new Engine();
        engine1.manufacturer = "VW";

        engine1.capacity = 2000;
        Car carReference = new Car(engine1);
        carReference.setName("Audi");
        carReference.setColor("Red");
        carReference.setMaxSpeed(260);
        carReference.setMileage(6.2);
        carReference.setFuelLevel(100);
        carReference.setDamaged(true);

        System.out.println("Name" + carReference.getName());


//        carReference.engine = new Engine();
//        carReference.engine.manufacturer = "VW";
//        carReference.engine.capacity = 2000;




        double currentDistance = carReference.accelerate(60, 1);

        System.out.println("current distance" + currentDistance);

        Mechanic mechanic = new Mechanic();
        mechanic.repair(carReference);

        System.out.println("is car damaged " + carReference.isDamaged());

//        System.out.println("Engine details:");
//        System.out.println(engine1.capacity);
//        System.out.println(carReference.engine.capacity);
//
//        engine1.capacity=2100;
//
//        System.out.println("Updated engine details:");
//        System.out.println(engine1.capacity);
//        System.out.println(carReference.engine.capacity);
//
//        //concatenare ...sout ( rovidites)
//        System.out.println("Properties of " + carReference.name);
//        System.out.println("Color: " + carReference.color);
//        System.out.println("Max speed " + carReference.maxSpeed);
//        System.out.println("mileage is " + carReference.mileage);
//        System.out.println("Racing number " + carReference.racingNumber);
//        System.out.println("Damaged "+ carReference.damaged);
//
//        carReference=null;
//
//        Car car2 = new Car(new Engine());
//
//        car2.name = "Lamborghini";
//        car2.damaged = true;
//
//        System.out.println();
//        System.out.println("Properties of " + car2.name);
//        System.out.println("Name is " + car2.name);
//        System.out.println("Damaged is " +car2.damaged);
//        System.out.println("Color is " + car2.color);

//        System.out.println(4 % 2==0);
//        System.out.println(4 % 2);
//        System.out.println(4 % 3);

    }
}

