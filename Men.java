package com.company;

public abstract class Men {
    public String name;

    public Men(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract String toString();

    public boolean equals(Object obj) {
        return obj != null && this.getClass() == obj.getClass();
    }

    public int hashCode() {
        return super.hashCode();
    }

    public void SendLetters() {
        System.out.println(this.toString() + " Отправляли бюллетени в газету");
    }
}
