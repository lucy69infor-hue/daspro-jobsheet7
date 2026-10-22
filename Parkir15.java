import java.util.Scanner;
public class Parkir15 {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
            System.out.println("Masukkan Jenis Kendaraan (1=mobil,2=motor,0=batal) : ");
            jenis = sc.nextInt();
            if (jenis == 1||jenis == 2) {
                System.out.println("Masukkan Durasi : ");
                durasi = sc.nextInt();
                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
        
                
                

            }
             
        }while (jenis != 0);
             System.out.println("Harga Parkir = " + total);
    
        sc.close();
        
            
    }
}
