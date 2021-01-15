package bljr1;

import java.util.Scanner;

public class Bljr1 {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    
    String Nama,Kelas,Sekolah;
    
        System.out.println("Data Pelajar");
        System.out.print("Nama :");
        Nama = scan.nextLine();
        System.out.print("Kelas :");
        Kelas = scan.nextLine();
        System.out.print("Sekolah :");
        Sekolah = scan.nextLine();
        System.out.println(" ");
        System.out.println("<<< Data Pelajar>>>");
        System.out.println("Nama :"+Nama);
        System.out.println("Kelas :"+Kelas);
        System.out.println("Sekolah :"+Sekolah);
        System.out.println(" ");
        
        if(Kelas.equalsIgnoreCase("X RPL 8")){
            System.out.println("Anda Anggota Kelas X RPL 8");
        }else{
            System.out.println("Anda Bukan Anggota Kelas X RPL 8");
        }
    }       
    
}
