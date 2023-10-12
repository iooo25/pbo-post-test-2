package com.child;

import com.parent.pakaian;

final public class baju extends pakaian {
    public baju(String merk, String warna, String jenis, String harga,int id) {
        super(merk, warna, jenis, harga,id);
    }

    @Override
    public void showPakaian() {
        System.out.println("===========================");
        System.out.println("ID PAKAIAN : "+getID());
        System.out.println("Nama baju : "+getMerk());
        System.out.println("Harga baju : "+getHarga());
        System.out.println("Warna baju : "+getWarna());
        System.out.println("Jenis baju : "+getJenis());
        System.out.println("===========================");
    }
}


