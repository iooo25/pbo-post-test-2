package com.parent;
public abstract class pakaian {
    String merk,warna,jenis,harga;
    int ID;

    public pakaian(String nama, String warna, String jenis, String harga, int id) {
        this.merk = nama;
        this.warna = warna;
        this.jenis = jenis;
        this.harga = harga;
        this.ID = id;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String nama) {
        this.merk = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getWarna() {
        return warna;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getID() {
        return ID;
    }

    public abstract void showPakaian();
}
