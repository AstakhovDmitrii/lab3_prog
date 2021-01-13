package com.company;

public enum AdequatlyOrMadly {
    Adequatly("адекватно"),
    Madly("безумно");

    private String translation;

    private AdequatlyOrMadly(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return this.translation;
    }
}