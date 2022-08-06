package com.sathamlet;

import com.sathamlet.almacenyverduleria.*;

public class Main {
    public static void main(String[] args) {
        Producto[] products;
        Lacteo lact1 = new Lacteo();
        lact1.setName("Santa Clara");
        lact1.setPrice(24.50);
        lact1.setQuantity(2);
        lact1.setProteins(328);
        
        products = new Producto[8];
        products[0] = lact1;
        
        Lacteo lact2 = new Lacteo("Alpura", 22.50, 321, 228);
        products[1] =lact2;
        Fruta fruit1 = new Fruta("Manzana", 7.50, 128, Color.ROJO);
        Fruta fruit2 = new Fruta("Naranja", 3.50, 123, Color.NARANJO);
        products[2] = fruit1;
        products[3] = fruit2;

        Limpieza limp1 = new Limpieza("Pinol", 27.50,  2,"Cloro, javon, etc...");
        Limpieza limp2 = new Limpieza("Cloro", 19.39,  2,"Compuestos quimicos");
        products[4] = limp1;
        products[5] = limp2;


        for(var item: products) {
            System.out.println("item = " + item);
            System.out.println();
        }



    }
}
