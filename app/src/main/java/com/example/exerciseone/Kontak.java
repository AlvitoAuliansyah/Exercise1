package com.example.exerciseone;

public class Kontak {
    private String Nama;
    private String Nomor;

    public Kontak(String nama, String nomor){
        Nama = nama;
        Nomor = nomor;
    }

    public String getNama() {
        return Nama;
    }

    public String getNomor() {
        return Nomor;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public void setNomor(String nomor) {
        Nomor = nomor;
    }
}
