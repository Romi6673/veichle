package com.example.veichle;

public class Car extends veichle{
    @Override
    public void accelerate(){
        System.out.println("car acceleration");
    }
    @Override
    public void start(){
        System.out.println("car start");
    }
    @Override
    public void stop(){
        System.out.println("car stop");
    }
}
