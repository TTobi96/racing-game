package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Track[] tracks = new Track[3];
    private List<Vehicle> competitors = new ArrayList<>();

    public void start(){
        System.out.println("Welcome");


        int PlayerCount = getPlayerCountFromUser();

        initializeTracks();
        displayTracks();
        Track selectedTrack = getSelectedTrackFromUser();
        System.out.println("Selected track" + selectedTrack.getName());

        initializeCompetitors();
    }

    private void playOneRound(){
        System.out.println("\nNew round");

        //inhanced for
        for (Vehicle vehicle : competitors){
            System.out.println("It's" + vehicle.getName() + "'s turn");

            double speed = getAccelationSpeedFromUser();
            vehicle.accelerate(speed);

            System.out.println();

        }
    }

    private void initializeCompetitors() {
        int playerCount = getPlayerCountFromUser();

        for (int i = 0; i < playerCount; i++) {
            System.out.println("Creating vehicle for competitor" + (i+1) );
            String name = getVehicleNameFromUser();

            Vehicle vehicle = new Vehicle();
            vehicle.setName(name);
            vehicle.setFuelLevel(80);
            vehicle.setMaxSpeed(260);
            vehicle.setMileage(ThreadLocalRandom.current().nextDouble(5,15));

            competitors.add(vehicle);

            competitors.add(vehicle);
        }
    }

    private void initializeTracks() {
        Track track1 = new Track();
        track1.setName("Imola");
        track1.setLength(3500);

        tracks[0] = track1;

        Track track2 = new Track();
        track2.setName("Suzuka");
        track2.setLength(4100);

        tracks  [1] = track2;

    }

    public void displayTracks(){
        System.out.println("Avaible tracks");

        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] != null) {


                System.out.println(" " + (i + 1) + ". " + tracks[i].getName() + "-" + tracks[i].getLength());
            }

        }
    }

    private Track getSelectedTrackFromUser(){
        System.out.println("please select a track");
        Scanner scanner = new Scanner(System.in);
        int trackNumber = scanner.nextInt();
        return tracks[trackNumber - 1];
    }

    private String getVehicleNameFromUser(){
        System.out.println("Please enter vehicle name= ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    private int getPlayerCountFromUser(){
        System.out.println("Please enter numbers of players =");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private double getAccelationSpeedFromUser(){
        System.out.println("Please enter acceleration speed");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
