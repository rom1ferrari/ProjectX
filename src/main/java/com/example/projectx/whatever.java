package com.example.thewheeldealplace;

public class DonneeDeVente {
    private int Kilometrage;
    private String MiseEnCirculation;
    private int Prix;

    public int getKilometrage() {
        return Kilometrage;
    }

    public void setKilometrage(int kilometrage) {
        Kilometrage = kilometrage;
    }

    public String getMiseEnCirculation() {
        return MiseEnCirculation;
    }

    public void setMiseEnCirculation(String miseEnCirculation) {
        MiseEnCirculation = miseEnCirculation;
    }

    public int getPrix() {
        return Prix;
    }

    public void setPrix(int prix) {
        Prix = prix;
    }

    public DonneeDeVente(int kilometrage, String miseEnCirculation, int prix) {
        Kilometrage = kilometrage;
        MiseEnCirculation = miseEnCirculation;
        Prix = prix;
    }
}