package com.sathamlet.almacenyverduleria;

public class Limpieza extends Producto {
    private String components;
    private double liter;
    public Limpieza(){}
    public Limpieza(String name , double price) {
        super(name, price);
    }

    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public double getLiter() {
        return liter;
    }

    public void setLiter(double liter) {
        this.liter = liter;
    }
}
