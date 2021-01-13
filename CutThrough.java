package com.company;

public class CutThrough extends Actions {
    public CutThrough() {
    }

    public String MenCutThrough() {
        return "прорубил";
    }

    public String MenNotCutThrough() {
        return "не прорубил";
    }

    public String toString() {
        return "прорубил";
    }

    public boolean equals(Object obj) {
        return obj != null && this.getClass() == obj.getClass();
    }

    public int hashCode() {
        return super.hashCode();
    }
}