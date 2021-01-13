package com.company;

public class See extends Actions {
    public See() {
    }



    public String FirstSee(){
        return "Первым завидел ";
    }

    public String toString() {
        return "увидели";
    }

    public boolean equals(Object obj) {
        return obj != null && this.getClass() == obj.getClass();
    }

    public int hashCode() {
        return super.hashCode();
    }
}