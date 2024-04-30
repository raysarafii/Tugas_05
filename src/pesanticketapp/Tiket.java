/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pesanticketapp;

/**
 *
 * @author User
 */
  import java.util.Scanner;



// Kelas abstrak untuk semua jenis tiket

   public abstract class Tiket {
    protected String jenis;
    protected int harga;

    public Tiket(String jenis, int harga) {
        this.jenis = jenis;
        this.harga = harga;
    }

    public int hitungHarga(int jumlah) {
        return harga * jumlah;
    }
}

