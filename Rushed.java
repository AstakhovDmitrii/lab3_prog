package com.company;

public class Rushed extends Actions {
    public Rushed() {
    }

    @Override
    public String toString() {
        return "бросились";
    }

    public boolean equals(Object obj) {
        return obj != null && this.getClass() == obj.getClass();
    }

    public int hashCode() {
        return super.hashCode();
    }
}