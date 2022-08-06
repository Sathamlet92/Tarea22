package com.sathamlet.almacenyverduleria;

public class NoPerecible extends Producto {
    private int content;
    private int calories;

    public NoPerecible() {
    }
    public NoPerecible(String name, double price) {
        super(name, price);
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
    public String toString() {
        return super.toString()
                +"\nContenido: " + this.getContent()
                +"\nCalorias: " + this.getCalories();
    }
}
