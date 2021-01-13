package com.company;

public class Permeate extends Actions {
    public Permeate() {
    }

    public String toString() {
        return " пронизывало ";
    }

    public boolean equals(Object obj) {
        return obj != null && this.getClass() == obj.getClass();
    }

    public int hashCode() {
        return super.hashCode();
    }
}