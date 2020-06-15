package com.company.Car;

import java.util.Random;

public class Car implements Runnable{
    int distance = 0;
    Random random = new Random();
    String name = "";

    public Car(String name) {
        this.name = name;
    }

    public void run() {
        while (distance < 100) {
            try {

                distance += 10;
                Thread.sleep(random.nextInt(1000));
                System.out.println(name + "Har kørt " + distance);
            } catch (Exception e ) {
                e.printStackTrace();
            }
        }
        System.out.println(name + "Er i mål");
    }
}
