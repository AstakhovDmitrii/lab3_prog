package com.company;

public abstract class Arkham {
    public Arkham() {
    }

    public abstract String toString();

    public boolean equals(Object obj) {
        return obj != null && this.getClass() == obj.getClass();
    }

    public int hashCode() {
        return super.hashCode();
    }
}