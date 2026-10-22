import java.util.Scanner;
public class KafeDoWhile15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namaPelanggan;
        int totalHarga, kopi, teh, roti, hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;


        do {
            System.out.println("Masukkan nama pelanggan (ketik batal untuk keluar): ");
            namaPelanggan = scanner.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.println("Jumlah Kopi : ");
            kopi = scanner.nextInt();
            System.out.println("Jumlah Teh : ");
            teh = scanner.nextInt();
            System.out.println("Jumlah Roti : ");
            roti = scanner.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar : Rp " + totalHarga);  
            scanner.nextLine(); 

        } while (true);

        System.out.println("Semua transaksi selesai.");
        scanner.close();
    }
    
}
