package com.company;

public class Mountains extends Arkham implements Approach {
    public Mountains() {
    }


    @Override
    public String toString() {
        return "горы";
    }

    public void GrewGradually(String gloomy){
        System.out.println("И, все же постепенно "+this.toString()+gloomy+" вырастали перед нами");
    }
    public String bigMount(){return " громад ";}

    public boolean equals(Object obj) {
        return obj != null && this.getClass() == obj.getClass();
    }

    public int hashCode() {
        return super.hashCode();
    }

    public void nesmotrya(String pla) {
        System.out.println(pla + this.toString() + this.aproach());
    }

    public String aproach() {
        return " совсем не приближались";
    }
}
