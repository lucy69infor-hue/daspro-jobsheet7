import java.util.Scanner;
public class SiakadWhile15 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nilai;
        int jml;

        System.out.println("Masukkan Jumlah Mahasiswa: ");
        jml = scanner.nextInt();

        int i = 1;
        while (i <= jml){
        System.out.println(" Masukkan Nilai Mahasiswa ke- " + i+ ": ");
        nilai = scanner.nextDouble();
        if (nilai < 0 || nilai > 100){
            System.out.println("Nilai tidak valid. silahkan masukkan nilai yang valid");
            continue;
        }
        if (nilai > 80 && nilai <= 100) {
            System.out.println("nilai mahasiswa ke-" + (i+1) + "adalah A");
        } else if (nilai > 73 && nilai <= 80 ) {
           System.out.println("nilai mahasiswa ke-" + (i+1) + "adalah B+");
        } else if (nilai > 65 && nilai <= 73){
            System.out.println("nilai mahasiswa ke-" + (i+1) + "adalah B");
        } else if (nilai > 60 && nilai <= 65){
            System.out.println("nilai mahasiswa ke-" + (i+1) + "adalah C+");
        } else if (nilai > 50 && nilai <=60) {
            System.out.println("nilai mahasiswa ke-" + (i+1) + "adalah C");
        } else if (nilai > 39 && nilai <= 50 ){
            System.out.println("nilai mahasiswa ke-" + (i+1) + "adalah D");
        } else {
            System.out.println("nilai mahasiswa ke-" + (i+1) + "adalah E");
        }
        i++;
    }
    scanner.close();
    }
}

