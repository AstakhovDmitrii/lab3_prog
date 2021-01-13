package com.company;

import java.io.PrintStream;

public class AllGuys extends Men {
    public AllGuys(String name) {
        super(name);
    }

    public void AlldontTell() {
        System.out.println(this.toString() + " не стали бы рассказывать, будь это возможно, о наших переживаниях всему человечеству");
    }

    public void CantTransfer(String adequatly, String feel) {
        System.out.println(this.toString()+ " не могли " + adequatly + " передавать"+ feel);

    }

    public void GandD(String G, String D) {
        System.out.println(G + " and " + D +" неотрывно следили за фантомами");

    }
    public void miracle(String permeate, String wonder, String roselight, String bigMount, String icedust){
        System.out.println("Нас"+permeate+"ожидание"+wonder+", переживаемое при виде этих"+roselight+bigMount+"на фоне облаков"+icedust);
    }
    public String vse() {
        return "все";
    }

    public String toString() {
        return "Мы";
    }

    public boolean equals(Object obj) {
        return obj != null && this.getClass() == obj.getClass();
    }

    public int hashCode() {
        return super.hashCode();
    }
}