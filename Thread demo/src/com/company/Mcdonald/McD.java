package com.company.Mcdonald;

public class McD {
    public static void main(String[] args) {

        Slide slide = new Slide(); //den som ved hvor mange burgere eksistere
        Producer producer = new Producer(slide);
        Consumer consumer = new Consumer(slide);

        Thread threadProducer = new Thread(producer);
        Thread threadConsumer = new Thread(consumer);

        threadProducer.start();
        threadConsumer.start();
    }
}
