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

public class PemeranPendukung extends KarakterPemain{
    
    private String namaPanggilan;

    public PemeranPendukung(String nama, String makanan, String sifat, int umur) {
        super(nama, makanan, sifat, umur);
        this.nama = nama;
        this.makanan = makanan;
        this.sifat = sifat;
        this.umur = umur;
    }

    public String getNamaPanggilan() {
        return namaPanggilan;
    }
    public void setNamaPanggilan(String namaPanggilan) {
        this.namaPanggilan = namaPanggilan;
    }
}
