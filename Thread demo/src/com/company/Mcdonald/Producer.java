package com.company.Mcdonald;

import java.util.Random;

public class Producer implements Runnable{

    private Slide slide;
    private int count = 0;
    private Random random = new Random();
    public Producer(Slide slide) {
        this.slide = slide;
    }

    //kaldes automatisk af startmetoden fra tråden
    @Override
    public void run() {
        while (count < 10) {
            slide.makeBurger();
            try {
                Thread.sleep(random.nextInt(200));
            }catch (Exception e) {
                e.printStackTrace();
            }
            count++;
        }
    }
}
