package com.company;

public class Newspapers {
    public Newspapers() {
    }

    public String toString() {
        return "Газеты";
    }

    public void Print() {
        System.out.println(this.toString() + " напечатали бюллетени, посланные нами с борта самолета");
    }

    public boolean equals(Object obj) {
        return obj != null && this.getClass() == obj.getClass();
    }

    public int hashCode() {
        return super.hashCode();
    }
}