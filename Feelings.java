package com.company;

public class Feelings {

    public String toString() {
        return " охватившие нас чувства";
    }

    public boolean equals(Object obj) {
        return obj != null && this.getClass() == obj.getClass();
    }

    public int hashCode() {
        return super.hashCode();
    }
}