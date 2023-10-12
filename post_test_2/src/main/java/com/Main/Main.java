package com.Main;

import com.child.baju;
import com.child.celana;
import com.parent.pakaian;

import java.util.ArrayList;
import java.util.Scanner;

final public class Main {
    final static Scanner input = new Scanner(System.in);
    final static ArrayList<pakaian> arrayPakaian = new ArrayList<pakaian>();

    public static void main(String[] args) {
        while (true){
            System.out.println("\n1. Menambahkan pakaian");
            System.out.println("2. Menampilkan daftar pakaian");
            System.out.println("3. Mengubah pakaian");
            System.out.println("4. Menghapus pakaian");
            System.out.println("5. Exit");
            System.out.print("Masukkan pilihan (1/2/3/4/5) : ");

            String pilihan = input.nextLine();

            switch (pilihan){
                case "1":
                    String choice = pilihan();
                    nambahData(choice);
                    break;
                case "2":
                    menampilkanDataPakaian();
                    break;
                case "3":
                    choice = pilihan();
                    mengubahDataPakaian(choice);
                    break;
                case "4":
                    mengapusDataPakaian();
                    break;
                case "5":
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("\nMasukkan pilihan yang tersedia");
            }
        }
    }static String pilihan(){
        System.out.println("\n1. Baju");
        System.out.println("2. Celana");
        System.out.print("Masukkan pilihan (1/2) : ");
        return input.nextLine();
    }
    static void nambahData(String choice){
        switch (choice){
            case "1":
                try {
                    if (arrayPakaian.isEmpty()){
                        System.out.print("Masukkan ID pakaian : ");
                        int nambahID = Integer.parseInt(input.nextLine());
                        System.out.print("Masukkan merk baju : ");
                        String nambahMerk = input.nextLine();
                        System.out.print("Masukkan warna baju : ");
                        String nambahWarna = input.nextLine();
                        System.out.print("Masukkan jenis baju : ");
                        String nambahJenis = input.nextLine();
                        System.out.print("Masukkan harga baju : ");
                        String nambahHarga = input.nextLine();

                        pakaian objek = new baju(nambahMerk,nambahWarna,nambahJenis,nambahHarga,nambahID);
                        arrayPakaian.add(objek);
                        System.out.println("\nbaju berhasil ditambahkan");
                    }else {
                        System.out.print("Masukkan ID pakaian : ");
                        int nambahID = Integer.parseInt(input.nextLine());
                        for (pakaian objekPakaian:arrayPakaian){
                            if (objekPakaian.getID()==nambahID){
                                System.out.println("\nID tersebut sudah ada di dalam data pakaian");
                            }else {
                                System.out.print("Masukkan merk baju : ");
                                String nambahMerk = input.nextLine();
                                System.out.print("Masukkan warna baju : ");
                                String nambahWarna = input.nextLine();
                                System.out.print("Masukkan jenis baju : ");
                                String nambahJenis = input.nextLine();
                                System.out.print("Masukkan harga baju : ");
                                String nambahHarga = input.nextLine();

                                pakaian objek = new baju(nambahMerk,nambahWarna,nambahJenis,nambahHarga,nambahID);
                                arrayPakaian.add(objek);
                                System.out.println("\nbaju berhasil ditambahkan");
                                break;
                            }
                        }
                    }
                }catch (NumberFormatException e){
                    System.out.println("\nHarap masukkan angka untuk menginputkan ID");
                }
                break;
            case "2":
                try {
                    if (arrayPakaian.isEmpty()){
                        System.out.print("Masukkan ID pakaian : ");
                        int nambahIDCelana = Integer.parseInt(input.nextLine());
                        System.out.print("Masukkan merk celana : ");
                        String nambahMerkCelana = input.nextLine();
                        System.out.print("Masukkan warna celana : ");
                        String nambahWarnaCelana = input.nextLine();
                        System.out.print("Masukkan jenis celana : ");
                        String nambahJenisCelana = input.nextLine();
                        System.out.print("Masukkan harga celana : ");
                        String nambahHargaCelana = input.nextLine();

                        pakaian objek = new celana(nambahMerkCelana,nambahWarnaCelana,nambahJenisCelana,nambahHargaCelana,nambahIDCelana);
                        arrayPakaian.add(objek);
                        System.out.println("celana berhasil ditambahkan");
                    }else {
                        System.out.print("Masukkan ID pakaian : ");
                        int nambahIDCelana = Integer.parseInt(input.nextLine());
                        for (pakaian objekPakaian:arrayPakaian){
                            if (objekPakaian.getID()==nambahIDCelana){
                                System.out.println("\nID tersebut sudah ada di dalam data pakaian");
                            }else {
                                System.out.print("Masukkan merk celana : ");
                                String nambahMerkCelana = input.nextLine();
                                System.out.print("Masukkan warna celana : ");
                                String nambahWarnaCelana = input.nextLine();
                                System.out.print("Masukkan jenis celana : ");
                                String nambahJenisCelana = input.nextLine();
                                System.out.print("Masukkan harga celana : ");
                                String nambahHargaCelana = input.nextLine();

                                pakaian objek = new celana(nambahMerkCelana,nambahWarnaCelana,nambahJenisCelana,nambahHargaCelana,nambahIDCelana);
                                arrayPakaian.add(objek);
                                System.out.println("\ncelana berhasil ditambahkan");
                                break;
                            }
                        }
                    }
                }catch (NumberFormatException e){
                    System.out.println("\nHarap masukkan angka untuk menginputkan ID");
                }
                break;
            default:
                System.out.println("\nMasukkan pilihan yang tersedia");
        }
    }

    static void menampilkanDataPakaian(){
        if (arrayPakaian.isEmpty()){
            System.out.println("\nData pakaian masih kosong");
        }else {
            for (pakaian objek:arrayPakaian) {
                objek.showPakaian();
            }
        }
    }

    static void mengubahDataPakaian(String choice){
        boolean ditemukan = false;
        switch (choice){
            case "1":
                if (arrayPakaian.isEmpty()){
                    System.out.println("\nData pakaian masih kosong");
                }else {
                    System.out.print("Masukkan ID pakaian yang ingin diubah : ");
                    int inputID = Integer.parseInt(input.nextLine());
                    for (pakaian objek:arrayPakaian){
                        if (objek instanceof baju){
                            if (objek.getID()==inputID){
                                System.out.print("Masukkan merk baju baru :  ");
                                String merkBaru = input.nextLine();
                                System.out.print("Masukkan warna baju baru :  ");
                                String warnaBaru = input.nextLine();
                                System.out.print("Masukkan jenis baju baru :  ");
                                String jenisBaru = input.nextLine();
                                System.out.print("Masukkan harga baju baru :  ");
                                String hargaBaru = input.nextLine();

                                objek.setHarga(hargaBaru);
                                objek.setJenis(jenisBaru);
                                objek.setMerk(merkBaru);
                                objek.setWarna(warnaBaru);

                                System.out.println("\nData pakaian dengan ID "+objek.getID()+" berhasil diubah");
                                ditemukan = true;
                            }
                        }
                    }if (!ditemukan){
                        System.out.println("\nData pakaian dengan ID "+inputID+" tidak ditemukan");
                    }
                }
                break;
            case "2":
                if (arrayPakaian.isEmpty()){
                    System.out.println("\nData pakaian masih kosong");
                }else {
                    System.out.print("Masukkan ID pakaian yang ingin diubah : ");
                    int inputID = Integer.parseInt(input.nextLine());
                    for (pakaian objek:arrayPakaian){
                        if (objek instanceof celana){
                            if (objek.getID()==inputID){
                                System.out.print("Masukkan merk celana baru :  ");
                                String merkBaruCelana = input.nextLine();
                                System.out.print("Masukkan warna celana baru :  ");
                                String warnaBaruCelana = input.nextLine();
                                System.out.print("Masukkan jenis celana baru :  ");
                                String jenisBaruCelana = input.nextLine();
                                System.out.print("Masukkan harga celana baru :  ");
                                String hargaBaruCelana = input.nextLine();

                                objek.setHarga(hargaBaruCelana);
                                objek.setJenis(jenisBaruCelana);
                                objek.setMerk(merkBaruCelana);
                                objek.setWarna(warnaBaruCelana);

                                System.out.println("\nData pakaian dengan ID "+objek.getID()+" berhasil diubah");
                                ditemukan = true;
                            }
                        }
                    }if (!ditemukan){
                        System.out.println("\nData pakaian dengan ID "+inputID+" tidak ditemukan");
                    }
                }
                break;
            default:
                System.out.println("\nMasukkan pilihan yang tersedia");
        }
    }

    static void mengapusDataPakaian(){
        boolean ditemukan = false;
        if (arrayPakaian.isEmpty()){
            System.out.println("\nData pakaian masih kosong");
        }else {
            System.out.print("Masukkan ID pakaian yang ingin dihapus : ");
            int inputID = Integer.parseInt(input.nextLine());
            for (pakaian objek:arrayPakaian){
                if (objek.getID()==inputID){
                    arrayPakaian.remove(objek);
                    System.out.println("\nData pakaian dengan ID "+objek.getID()+" berhasil dihapus");
                    ditemukan = true;
                    break;

                }
            }if (!ditemukan){
                System.out.println("\nData pakaian dengan ID "+inputID+" tidak ditemukan");
            }

        }
    }
}
