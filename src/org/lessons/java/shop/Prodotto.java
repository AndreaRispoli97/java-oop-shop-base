package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    // attributi
    private int codice;
    private String nome;
    private String marca;
    private float prezzo;
    private int iva;

    // Costruttore
    public Prodotto(String nome, String marca, float prezzo, int iva) {
        this(); // Per chiamare il secondo costruttore
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // Secondo Costruttore
    public Prodotto() {
        Random rand = new Random();
        this.codice = rand.nextInt(10000);
    }

    // Terzo costruttore
    public Prodotto(String nome, String marca, float prezzo) {
        this(nome, marca, prezzo, 22);
        // this();
        // this.nome = nome;
        // this.marca = marca;
        // this.prezzo = prezzo;
        // this.iva = 22;
    }

    // Getter per la lettura
    public int getCodice() {
        return this.codice;
    }

    public String getNome() {
        return this.nome;
    }

    public String getMarca() {
        return this.marca;
    }

    public float getPrezzo() {
        return this.prezzo;
    }

    public int getIva() {
        return this.iva;
    }

    // Setter per la scrittura
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    // Metodi
    public float getPrezzoBase() {
        return this.prezzo;
    }

    public String getNomeEsteso() {
        return codice + "-" + nome;
    }

    public float getPrezzoIva() {
        float risultato = prezzo + (prezzo * iva / 100);
        float cifraArr = Math.round(risultato * 100) / 100f;
        return cifraArr;
    }
}
