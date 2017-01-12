package com.example.mypc.demoabstractandinterface;

/**
 * Created by MyPC on 1/10/2017.
 */

public class Cat extends Animal implements Run {
    public Cat() {
        super("Cat", "MeoMeo");
    }

    @Override
    public String Run() {
        return " ,Chạy bằng chân";
    }

    @Override
    protected String MakeSound() {
        return super.MakeSound()+"\n"+Run();
    }
}
