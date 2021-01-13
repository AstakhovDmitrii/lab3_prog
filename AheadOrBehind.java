package com.company;

public enum AheadOrBehind {
    AHEAD("впереди"),
    BEHIND("позади");

    private String translation;

    private AheadOrBehind(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return this.translation;
    }
}