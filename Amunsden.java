package com.company;

public class Amunsden extends Men {
    public Amunsden(String name) {
        super(name);
    }

    public String toString() {
        return "Амундсен";
    }

    public void SawSnowCylinders() {
        System.out.println(this.toString() + " заметил раннее снежные цилиндры");
    }
}