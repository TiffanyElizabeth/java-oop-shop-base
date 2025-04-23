package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto blueJacket = new Prodotto("blue jacket", "waterproof women's blue rain jacket", 229.2, 0.24);

        System.out.println(blueJacket.basePrice);
        System.out.println(blueJacket.getFinalPrice());
        System.out.println(blueJacket.code);
        System.out.println(blueJacket.getCodeName());
    }
}
