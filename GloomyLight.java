package com.company;

public enum GloomyLight {
    GLOOMY(" мрачно"),
    LIGHT("светло");

    private String translation;

    private GloomyLight(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return this.translation;
    }
}