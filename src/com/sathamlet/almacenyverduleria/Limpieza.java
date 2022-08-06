package com.sathamlet.almacenyverduleria;

public class Limpieza extends Producto {
    private String components;
    private double liter;
    public Limpieza(){}
    public Limpieza(String name, double price, double liter, String components) {
        super(name, price);
        this.liter = liter;
        this.components = components;
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
    public String toString() {
        return super.toString()
                +"\nComponenetes: " + this.getComponents()
                +"\nLitros: " + this.getLiter();
    }
}
