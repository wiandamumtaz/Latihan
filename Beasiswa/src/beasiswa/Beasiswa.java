package beasiswa;
import java.util.Scanner;
public class Beasiswa {

    public static void main(String[] args) {
        // Input
        Scanner Masukkan = new Scanner(System.in);
        System.out.println("Masukkan Nilai TPA : ");
        int TPA = Masukkan.nextInt();
        System.out.println("Masukkan Nilai Bahasa Inggris :");
        int BahasaInggris = Masukkan.nextInt();
        if ((TPA > 85) && (BahasaInggris > 80))
            System.out.println("Siswa dapat Beasiswa ");
        else
            System.out.println("Siswa Tidak dapat Beasiswa :");
    }
    
}
