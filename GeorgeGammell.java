package com.company;

public class GeorgeGammell extends Men implements Decide {
    public GeorgeGammell(String name) {
        super(name);
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "Джордж Гэмэл";
    }

    public void LosePeaceAndQuiet() {
        System.out.println(this.toString() + " навсегда потерял мир и покой");
    }

    public String decide() {
        return null;
    }
}