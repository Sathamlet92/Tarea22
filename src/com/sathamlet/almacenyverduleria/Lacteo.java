package com.sathamlet.almacenyverduleria;

public class Lacteo extends Producto{
    private int quantity;
    private int proteins;
    public Lacteo(int proteins){}
    public Lacteo(String name, int quantity){
        super(name, quantity);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProteins() {
        return proteins;
    }
}
