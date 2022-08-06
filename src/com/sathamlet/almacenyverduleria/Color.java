package com.sathamlet.almacenyverduleria;

public enum Color {
    ROJO("Rojo"),
    VERDE("Verde"),
    MORADO("Morado"),
    BLANCO("Blanco"),
    NARANJO("Naranjo");
    private final String color;
    Color(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return this.color;
    }
}
