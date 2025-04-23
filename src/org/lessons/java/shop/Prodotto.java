package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    // characteristics
    public int code;
    public String name;
    public String codeName; // = code + "-" + name;
    public String description;
    public double basePrice;
    public double vat;
    public double finalPrice; // = (basePrice * vat) + basePrice;
    public boolean isAvailable;

    // methods
    public void checkStock() {
        this.isAvailable = true;
    }

    public String getCodeName() {
        this.codeName = this.code + "-" + this.name;
        return this.codeName;
    }

    public double getFinalPrice() {
        this.finalPrice = (this.basePrice * this.vat) + this.basePrice;
        this.finalPrice = Math.round(this.finalPrice * 100.0) / 100.0;
        return this.finalPrice;
    }

    // constructor
    public Prodotto(String name, String description, double basePrice, double vat) {
        Random random = new Random();
        this.code = random.nextInt(999999);
        this.name = name;
        this.description = description;
        this.basePrice = basePrice;
        this.vat = vat;
        this.isAvailable = false;
    }
}
