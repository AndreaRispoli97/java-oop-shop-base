package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    // attributi
    public int codice;
    public String nome;
    public String descrizione;
    public float prezzo;
    public int iva;

    // Costruttore
    public Prodotto(String nome, String descrizione, float prezzo, int iva) {
        Random rand = new Random();
        this.codice = rand.nextInt(10000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // Metodi

    // *Errato

    // public void randomCode(int codice) {
    // Random rand = new Random();
    // this.codice = rand.nextInt(10000);
    // }

    public float prezzoBase() {
        return this.prezzo;
    }

    public String nomeEsteso() {
        return codice + "-" + nome;
    }

    public float prezzoIva() {
        float risultato = prezzo + (prezzo * iva / 100);
        float cifraArr = Math.round(risultato * 100) / 100f;
        return cifraArr;
    }

}
