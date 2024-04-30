/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pesanticketapp;

/**
 *
 * @author User
 */
public class Pemesanan {
    private String nama;
    private int tahap;
    private Tiket tiket;
    private int jumlah;

    public Pemesanan(String nama, int tahap, Tiket tiket, int jumlah) {
        this.nama = nama;
        this.tahap = tahap;
        this.tiket = tiket;
        this.jumlah = jumlah;
    }

    public void cetakNota() {
        int totalHarga = tiket.hitungHarga(jumlah);
        System.out.println("===== NOTA PEMESANAN =====");
        System.out.println("Nama Pembeli: " + nama);
        System.out.println("Tahap Pembelian: " + (tahap == 1 ? "presale" : "reguler"));
        System.out.println("Jenis Tiket: " + tiket.jenis);
        System.out.println("Jumlah Tiket: " + jumlah);
        System.out.println("Total Harga: " + totalHarga);
        System.out.println("==========================");
    }
}