package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto blueJacket = new Prodotto("blue jacket", "patagonia", 229.2, 0.24);

        System.out.println(blueJacket.getBasePrice());
        System.out.println(blueJacket.getFinalPrice());
        System.out.println(blueJacket.getCode());
        System.out.println(blueJacket.getCodeName());

        System.out.println(blueJacket.isAvailable());
        blueJacket.markAsAvailable();
        System.out.println(blueJacket.isAvailable());

        Prodotto blackJeans = new Prodotto(900042, "black jeans", "j brand", 200, 0.22);

        System.out.println(blackJeans.getBrand());
        System.out.println(blackJeans.getCode());
        System.out.println(blackJeans.getCodeName());
    }
}
