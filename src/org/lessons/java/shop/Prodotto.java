package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    // characteristics
    private int code;
    private String name;
    // private String codeName;
    private String brand;
    private double basePrice;
    private double vat;
    // private double finalPrice;
    private boolean isAvailable;

    // private method to generate random product code
    private int generateCode() {
        Random random = new Random();
        return random.nextInt(999999);
    }

    // public methods
    public void markAsAvailable() {
        this.isAvailable = true;
    }

    public String getCodeName() {
        // this.codeName = this.code + "-" + this.name;
        // return this.codeName;
        return code + "-" + name;
    }

    public double getFinalPrice() {
        if (vat == 0) {
            return this.basePrice;
        } else {
            double pricePlusVAT = (basePrice * vat) + basePrice;
            return Math.round(pricePlusVAT * 100.0) / 100.0;
        }
    }

    // getters and setters
    public int getCode() { // when code is given by the shop owner, not generated randomly (constructor
                           // number 2)
        return this.code;
    }

    // public void setCode(int code) {
    // this.code = code;
    // }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // constructor 1 (general)
    public Prodotto(String name, String brand, double basePrice, double vat) {
        // Random random = new Random();
        // this.code = random.nextInt(999999);
        this.code = generateCode(); // randomly generated using method above
        this.name = name;
        this.brand = brand;
        this.basePrice = basePrice;
        this.vat = vat;
        this.isAvailable = false;
    }

    // constructor 2 (for instances when the shop owner wants to define the code,
    // not generate it randomly)

    public Prodotto(int code, String name, String brand, double basePrice, double vat) {
        // Random random = new Random();
        // this.code = random.nextInt(999999);
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.basePrice = basePrice;
        this.vat = vat;
        this.isAvailable = false;
    }
}
