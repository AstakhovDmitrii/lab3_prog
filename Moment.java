package com.company;

public class Moment {
    public Moment() {
    }

    public String toString() {
        return "момент";
    }

    public void MomentStart() {
        System.out.print("Наступил " + this.toString() + ", когда ");
    }

    public boolean equals(Object obj) {
        return obj != null && this.getClass() == obj.getClass();
    }

    public int hashCode() {
        return super.hashCode();
    }
}