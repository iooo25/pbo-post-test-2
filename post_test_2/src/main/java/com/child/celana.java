package com.child;

import com.parent.pakaian;

final public class celana extends pakaian {
    public celana(String merk, String warna, String jenis, String harga,int id) {
        super(merk, warna, jenis, harga,id);
    }

    @Override
    public void showPakaian() {
        System.out.println("===========================");
        System.out.println("ID PAKAIAN : "+getID());
        System.out.println("Nama celana : "+getMerk());
        System.out.println("Harga celana : "+getHarga());
        System.out.println("Warna celana : "+getWarna());
        System.out.println("Jenis celana : "+getJenis());
        System.out.println("===========================");
    }
}
