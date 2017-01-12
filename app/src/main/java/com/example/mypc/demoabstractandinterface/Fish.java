package com.example.mypc.demoabstractandinterface;

/**
 * Created by MyPC on 1/10/2017.
 */

public class Fish extends Animal implements ISwimable,IFly  {
    public Fish() {
        super("Fish Fly", "ImIm");
    }

    @Override
    public String Swim() {
        return " ,Bơi bằng đuôi";
    }

    @Override
    public String Fly() {
        return " ,Bay Bằng cánh";
    }

    @Override
    protected String MakeSound() {
        return super.MakeSound()+"\n"+Swim()+"\n"+Fly();
    }
}
