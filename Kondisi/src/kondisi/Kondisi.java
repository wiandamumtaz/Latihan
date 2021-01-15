package kondisi;

import java.util.Scanner;

public class Kondisi {
    public static void main(String[] args) {
        // input 
        Scanner Masukkan = new Scanner(System.in);
        int nilai;
        System.out.print("Masukkan Nilai Akhri PBO :");
        nilai = Masukkan.nextInt();
        if (nilai < 70)
        System.out.println("Siswa Tidak Lulus");
        if (nilai > 70)
            System.out.println("Siswa Lulus");
    }
    
}
