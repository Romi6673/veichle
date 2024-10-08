package com.example.veichle;

public class bicycle extends veichle{
    @Override
    public void accelerate(){
        System.out.println("bicycle acceleration");
    }
    @Override
    public void start(){
        System.out.println("bicycle start");
    }
    @Override
    public void stop(){
        System.out.println("bicycle stop");
    }
}
