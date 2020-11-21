/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan59.detectiveconan;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

public class KarakterPemain {
    
    protected String nama;
    protected String makanan;
    protected String sifat;
    protected int umur;
    
    public KarakterPemain(String nama, String makanan, String sifat, int umur){
        this.nama = nama;
        this.makanan = makanan;
        this.sifat = sifat;
        this.umur = umur;
    }
    
    public void tampilKarakter(){
        System.out.println("Nama Karakter : "+nama);
        System.out.println("Makanan Kesukaan : "+makanan);
        System.out.println("Sifat Karakter : "+sifat);
        System.out.println("Umur Karakter : "+umur);
    }
}
