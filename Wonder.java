package com.company;

public class Wonder extends Arkham {
    public Wonder() {
    }

    public String toString() {
        return " чуда";
    }

    public boolean equals(Object obj) {
        return obj != null && this.getClass() == obj.getClass();
    }

    public int hashCode() {
        return super.hashCode();
    }
}
