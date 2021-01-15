package tugaspraktikum1;
import java.util.Scanner;
public class TugasPraktikum1 {


    public static void main(String[] args) {
        // input 
        Scanner Masukkan = new Scanner(System.in);
        System.out.println("Luas Permukaan Bola");
        System.out.println("_______________________");
        System.out.println("Masukkan Jari-Jari Bola = ");
        int Jari_Jari = Masukkan.nextInt();
        
        //proses+output
        System.out.println("Luas Permukaan Bola = "+(4*3.14*Jari_Jari*Jari_Jari));
    }
    
}
