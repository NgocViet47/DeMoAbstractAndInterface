package com.example.mypc.demoabstractandinterface;


/**
 * Created by MyPC on 1/10/2017.
 */

public class Dog extends Animal implements ISwimable,Run {
    public Dog() {
        super("Dog", "GoGo");
    }

    @Override
    public String Swim() {
        return " ,Bơi bằng 4 chân";
    }

    @Override
    public String Run() {
        return " ,Chạy bằng chân";
    }

    @Override
    protected String MakeSound() {
        return (super.MakeSound()+"\n"+Run()+"\n"+Swim());
    }

    @Override
    protected String MakeSuond(String overLoad) {
        return (super.MakeSound()+"\n"+Run()+"\n"+Swim()+"\n"+overLoad);
    }
}
