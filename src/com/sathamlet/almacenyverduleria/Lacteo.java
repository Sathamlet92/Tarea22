package com.sathamlet.almacenyverduleria;

public class Lacteo extends Producto{
    private int quantity;
    private int proteins;

    public Lacteo(){}

    public Lacteo(String name, double price, int quantity, int proteins){
        super(name, price);
        this.proteins = proteins;
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

    public void setProteins(int proteins) {
        this.proteins = proteins;
    }

    @Override
    public String toString(){
        return super.toString()
                + "\n Candidad: " + this.getQuantity()
                + "\n Proteins: " + this.getProteins();
    }
}
