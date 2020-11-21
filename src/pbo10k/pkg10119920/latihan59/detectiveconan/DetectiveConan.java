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

public class DetectiveConan {

    public static void main(String[] args) {
        
        PemeranUtama utama = new PemeranUtama("Shinichi Kudo", "Pai", "Ambisius", 21);
        utama.setNamaSamaran("Conan");
        utama.tampilKarakter();
        System.out.println("Nama Samaran : "+ utama.getNamaSamaran());
        System.out.println();
    
        PemeranPendukung pendukung = new PemeranPendukung("Kogoro Mouri", "Ramen", "Pantang Menyerah", 30);
        pendukung.setNamaPanggilan("Heiji");
        pendukung.tampilKarakter();
        System.out.println("Nama Panggilan : " + pendukung.getNamaPanggilan());
    }
}