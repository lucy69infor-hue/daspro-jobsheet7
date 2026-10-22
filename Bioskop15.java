import java.util.Scanner;
public class Bioskop15 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int tiket, jml, totalTiket = 0, i = 0;
        double hargaTiket = 50000, diskon, subtotal, totalBayar, totalPenjualan = 0;

        System.out.println("Masukan Jumlah Pelanggan : ");
        jml = sc.nextInt();
          while (i < jml ){
            System.out.println("Pelanggan ke- " + (i+1));
            System.out.println("Masukkan jumlah tiket : ");
            tiket = sc.nextInt();

            if (tiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan input ulang.");
                continue;
                
            }
                subtotal = tiket * hargaTiket;
                
            if (tiket > 10) {
                diskon = 0.15;
            } else if (tiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0;
            }
            totalBayar = subtotal * (1 - diskon);
            totalTiket += tiket;
            totalPenjualan += totalBayar;

            System.out.println("Subtotal       : Rp" + subtotal);
            System.out.println("Diskon         : " + (diskon * 100) + "%");
            System.out.println("Total bayar    : Rp" + totalBayar);

             i++;

            System.out.println("\n=== LAPORAN PENJUALAN HARIAN ===");
            System.out.println("Total tiket terjual : " + totalTiket);
            System.out.println("Total penjualan     : Rp" + totalPenjualan);
            sc.close();
            
        }

    }
            


       
        
}


    

