package com.company.Mcdonald;

public class Slide {
    private int antalBurgere = 0; // skal altid være imellem 0-8

    public synchronized void makeBurger(){
        try {
            while(antalBurgere >= 8) {
                wait();
            }
            antalBurgere = antalBurgere + 1;
            System.out.println("Tilføjet burger. nr: " + antalBurgere);
            notify();
        } catch (Exception e) {

        }

    }

    public synchronized void takeBurger() {
        try {
            while (antalBurgere <=0) {
                wait();
            }
            antalBurgere--;
            System.out.println("Taget burger. nr: " + antalBurgere);
            notify();
        }catch (Exception e ) {

        }
    }


}
