package pilihan.kondisi;
import java.util.Scanner;
public class PilihanKondisi {

    public static void main(String[] args) {
        // input
        Scanner Masukkan = new Scanner (System.in);
        System.out.println("Silahkan Pilih Angka 1-3 :");
        int bil = Masukkan.nextInt();
        
        //output
        switch (bil) {
            case 1 : System.out.println("Satu");
                break;
            case 2 : System.out.println("Dua");
                break;
            case 3 : System.out.println("Tiga");
        }
    }
    
}
