package com.company;

public class Address {

    private String gorod;
    private String ulica;
    private int nomerDoma;

    public Address(String gorod, String ulica, int nomerDoma) {
        this.gorod = gorod;
        this.ulica = ulica;
        this.nomerDoma = nomerDoma;
    }

    public String getCity() {
        return gorod;
    }

    public String getStreet() {
        return ulica;
    }

    public int getHomeNumber() {
        return nomerDoma;
    }
}
