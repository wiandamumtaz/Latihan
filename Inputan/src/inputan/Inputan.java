package inputan;

import java.util.Scanner;

public class Inputan {


    public static void main(String[] args) {
        //input 
        Scanner masukkan = new Scanner(System.in);
        int a, b;
        System.out.print("Masukkan Nilai a :");
        a = masukkan.nextInt();
        System.out.print("Masukkan Nilai b :");
        b = masukkan.nextInt();
        System.out.println();
        
        //output
        System.out.println("Nilai Variabel yang ada pada program :");
        System.out.println("a ="+a);
        System.out.println("b ="+b);
    }
    
}
