/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pesanticketapp;
import java.util.Scanner;
/**
 *
 * @author User
 */
 
public class PesanTicketAPP {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket!");

        // Meminta input nama pembeli
        System.out.print("Masukkan nama pembeli: ");
        String nama = scanner.nextLine();

        // Meminta input tahap pembelian
        System.out.println("Pilih tahap pembelian");
         System.out.println("1. Presale");
          System.out.println("2. Reguler");
           System.out.print("Pilih tahap pembelian (1/2): ");
        int tahap = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline dari buffer

        if (tahap != 1 && tahap != 2) {
            System.out.println("Input tidak valid!");
            System.exit(0);
        }

        // Menampilkan opsi pembelian tiket sesuai dengan tahap
         if (tahap == 1) {
              System.out.println("Pilih jenis tiket:");
            System.out.println("1. VIP");
            System.out.println("2. VVIP");
            System.out.print("Pilih jenis tiket (1/2): ");
             Tiket tiket = null;
            int jenisTiket = scanner.nextInt();
              switch (jenisTiket) {
            case 1:
                tiket = new VIP(tahap);
                break;
            case 2:
                tiket = new VVIP(tahap);
                break;
            default:
                System.out.println("Input tidak valid");
                System.exit(0);
        }
        scanner.nextLine(); // Membersihkan newline dari buffer
        System.out.print("Masukkan jumlah tiket yang dibeli: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline dari buffer
  

        // Membuat objek pemesanan untuk tiket REGULER, VIP, atau VVIP
        Pemesanan pesanan = new Pemesanan(nama, tahap, tiket, jumlah);

        // Mencetak nota pemesanan
        pesanan.cetakNota();
        
         }
        if (tahap == 2) {
            System.out.println("Pilih jenis tiket:");
            System.out.println("1. Festival");
            System.out.println("2. VIP");
            System.out.println("3. VVIP");
            int jenisTiket = scanner.nextInt();
                 Tiket tiket = null;
        switch (jenisTiket) {
            case 1:
                tiket = tahap == 1 ? new VIP(tahap) : new Festival(tahap);
                break;
            case 2:
                tiket = new VIP(tahap);
                break;
            case 3:
                tiket = new VVIP(tahap);
                break;
            default:
                System.out.println("Jenis tiket tidak valid.");
                System.exit(0);
        }
        scanner.nextLine(); // Membersihkan newline dari buffer
        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline dari buffer
   

        // Membuat objek pemesanan untuk tiket REGULER, VIP, atau VVIP
        Pemesanan pesanan = new Pemesanan(nama, tahap, tiket, jumlah);

        // Mencetak nota pemesanan
        pesanan.cetakNota();
        }

       
    }
}