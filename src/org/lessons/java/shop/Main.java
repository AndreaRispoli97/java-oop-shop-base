package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        // Creo l'oggetto1
        Prodotto asus = new Prodotto(0, "TUF", "Lorem Ipsum ecc....", 2099.50f, 22);

        // Creo l'oggetto2
        Prodotto mac = new Prodotto(0, "Mac-Book", "Lorem Ipsum ecc....", 1699.50f, 22);

        mac.randomCode(0);
        System.out.println("Codice del prodotto: " + mac.codice);
        System.out.println("Nome del prodotto: " + mac.nome);
        System.out.println("Descrizione del prodotto: " + mac.descrizione);
        System.out.println("Prezzo del Prodotto senza iva: " + mac.prezzo + "$");
        System.out.println("Prezzo con Iva: " + mac.prezzoIva() + "$");

        asus.randomCode(0);
        System.out.println("Codice del prodotto: " + asus.codice);
        System.out.println("Nome del prodotto: " + asus.nome);
        System.out.println("Descrizione del prodotto: " + asus.descrizione);
        System.out.println("Prezzo del Prodotto senza iva: " + asus.prezzo + "$");
        System.out.println("Prezzo con Iva: " + asus.prezzoIva() + "$");

    }
}
