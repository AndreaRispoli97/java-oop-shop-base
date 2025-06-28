package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        // Creo l'oggetto1
        Prodotto asus = new Prodotto("TUF", "Asus", 2099.50f, 22);

        // Creo l'oggetto2
        Prodotto mac = new Prodotto("MacBook", "Apple", 1699.50f, 22);

        // Creo il terzo oggetto per testare il secondo costruttore
        Prodotto hp = new Prodotto("Spectre", "HP", 1499.99f);

        System.out.println("---DETTAGLI PRODOTTO: " + hp.getNome() + "-" + hp.getMarca() + "---");
        // System.out.println("Codice del prodotto: " + hp.getCodice);
        System.out.println("Nome del prodotto: " + hp.getNome());
        System.out.println("Nome del prodotto esteso: " + hp.getNomeEsteso());
        System.out.println("Marca del prodotto: " + hp.getMarca());
        System.out.println("Prezzo del Prodotto senza iva: " + hp.getPrezzoBase() + "$");
        System.out.println("Prezzo con Iva: " + hp.getPrezzoIva() + "$");

        System.out.println("---DETTAGLI PRODOTTO: " + mac.getNome() + "-" + mac.getMarca() + "---");
        // System.out.println("Codice del prodotto: " + mac.getCodice);
        System.out.println("Nome del prodotto: " + mac.getNome());
        System.out.println("Nome del prodotto esteso: " + mac.getNomeEsteso());
        System.out.println("Marca del prodotto: " + mac.getMarca());
        System.out.println("Prezzo del Prodotto senza iva: " + mac.getPrezzoBase() + "$");
        // mac.setPrezzo(1500.00f);
        System.out.println("Prezzo con Iva: " + mac.getPrezzoIva() + "$");
        // mac.setIva(40);

        System.out.println("---DETTAGLI PRODOTTO: " + asus.getNome() + "-" + asus.getMarca() + "---");
        // System.out.println("Codice del prodotto: " + asus.getCodice);
        System.out.println("Nome del prodotto: " + asus.getNome());
        System.out.println("Nome del prodotto esteso: " + asus.getNomeEsteso());
        System.out.println("Marca del prodotto: " + asus.getMarca());
        System.out.println("Prezzo del Prodotto senza iva: " + asus.getPrezzoBase() +
                "$");
        System.out.println("Prezzo con Iva: " + asus.getPrezzoIva() + "$");

    }
}
