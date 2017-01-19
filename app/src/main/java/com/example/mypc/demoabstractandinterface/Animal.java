package com.example.mypc.demoabstractandinterface;

/**
 * Created by MyPC on 1/10/2017.
 */

public abstract class Animal {
    protected String Name;
    protected String Suond;
    public Animal(String name, String sound)
    {
        this.Name = name;
        this.Suond = sound;
    }

    protected String MakeSound()
    {
        return Name + " Suond " + Suond;
    }

    protected String MakeSuond(String overLoad){
        return Name + "Suond"+Suond +" "+overLoad;
    }
}
