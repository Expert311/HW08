package com.company;

public class Person extends Address {

    String imya;
    String familiya;
    Address address;

    public Person(String gorod, String ulica, int nomerDoma, String imya, String familiya) {
        super(gorod, ulica, nomerDoma);
        this.imya = imya;
        this.familiya = familiya;

    }

    public String getImya() {
        return imya;
    }

    public String getFamiliya() {
        return familiya;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{Imya='" + imya + "', Familiya='" + familiya + "', Address=" + address + "}";
    }
}