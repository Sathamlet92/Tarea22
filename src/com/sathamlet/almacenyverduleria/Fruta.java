package com.sathamlet.almacenyverduleria;

public class Fruta extends Producto{
    private double weight;
    private Color color;
    public Fruta(){}
    public Fruta(String name, double price, double weight, Color color) {
        super(name, price);
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return super.toString()
                +"\nPeso: " + this.getWeight()
                +"\nColor: " + this.getColor();
    }
}
