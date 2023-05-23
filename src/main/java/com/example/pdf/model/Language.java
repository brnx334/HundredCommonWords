package com.example.pdf.model;

public enum Language {
    RUSSIAN("ru"),
    ENGLISH("en-gb"),
    POLISH("pl");
    public final String label;

    Language(String label) {
        this.label = label;
    }
}
