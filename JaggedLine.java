package com.company;

public class JaggedLine extends Arkham {
    public JaggedLine() {
    }

    public String toString() {
        return " зубчатую линию таинственных кратеров и вершин ";
    }

    public boolean equals(Object obj) {
        return obj != null && this.getClass() == obj.getClass();
    }

    public int hashCode() {
        return super.hashCode();
    }
}
