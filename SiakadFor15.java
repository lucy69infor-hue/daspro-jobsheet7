import java.util.Scanner;
public class SiakadFor15 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    double nilai, tertinggi = 0, terendah = 100;
    int lulus = 0, tidaklulus = 0;

    for (int i = 1; i <= 10; i++){
        System.out.println("Masukkan nilai mahasiswa ke- " + i + ": ");
        nilai = scanner.nextDouble();
        if (nilai > tertinggi) {
            tertinggi = nilai;
            
        }
        if (nilai < terendah) {
            terendah = nilai;
            
        }
        if (nilai > 60) {
            lulus++;
        } else {
            tidaklulus++;
        }
    }
    
    System.out.println("nilai tertinggi : " + tertinggi);
    System.out.println("nilai terendah  : " + terendah);
    System.out.println("Jumlah lulus : " + lulus);
    System.out.println("Jumlah tidak lulus : " + tidaklulus);
    scanner.close();
    }
    
}