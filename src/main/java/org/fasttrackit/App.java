package org.fasttrackit;

/**
 * Hello world!
 */
public class App
{
    public static void main(String[] args)
    {
        System.out.println("Ilona jo rucah");

        Car carReference = new Car();
        carReference.name = "AUDI";
        carReference.color = "RED";
        carReference.maxSpeed = 260;
        carReference.mileage = 6.2;

//        carReference.engine = new Engine();
//        carReference.engine.manufacturer = "VW";
//        carReference.engine.capacity = 2000;

        Engine engine1 = new Engine();
        engine1.manufacturer = "VW";

        engine1.capacity = 2000;

        carReference.engine = engine1;

        System.out.println("Engine details:");
        System.out.println(engine1.capacity);
        System.out.println(carReference.engine.capacity);

        engine1.capacity=2100;

        System.out.println("Updated engine details:");
        System.out.println(engine1.capacity);
        System.out.println(carReference.engine.capacity);

        //concatenare ...sout ( rovidites)
        System.out.println("Properties of " + carReference.name);
        System.out.println("Color: " + carReference.color);
        System.out.println("Max speed " + carReference.maxSpeed);
        System.out.println("mileage is " + carReference.mileage);
        System.out.println("Racing number " + carReference.racingNumber);
        System.out.println("Damaged "+ carReference.damaged);

        carReference=null;

        Car car2 = new Car();
        car2.name = "Lamborghini";
        car2.damaged = true;

        System.out.println();
        System.out.println("Properties of " + car2.name);
        System.out.println("Name is " + car2.name);
        System.out.println("Damaged is " +car2.damaged);
        System.out.println("Color is " + car2.color);



    }
}

