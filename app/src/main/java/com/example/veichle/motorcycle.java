package com.example.veichle;

public class motorcycle extends veichle {
    @Override
    public void accelerate(){
        System.out.println("motorcycle acceleration");
    }
    @Override
    public void start(){
        System.out.println("motorcycle start");
    }
    @Override
    public void stop(){
        System.out.println("motorcycle stop");
    }
}
