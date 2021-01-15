package tugaspraktikum3;

import java.util.Scanner;

public class TugasPraktikum3 {

    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    String Nama,TempatLahir,JenisKelamin,Alamat,Motto;
    int NIS,TanggalLahir;
    
    //input 
        System.out.println("BIODATA DIRI");
        System.out.println("____________");
        System.out.print("Nama :");
        Nama = scan.nextLine();
        System.out.print("Tempat Lahir :");
        TempatLahir = scan.nextLine();
        System.out.print("Jenis Kelamin :");
        JenisKelamin = scan.nextLine();
        System.out.print("Alamat di Malang :");
        Alamat = scan.nextLine();
        System.out.print("Motto Hidup :");
        Motto = scan.nextLine();
        System.out.print("NIS :");
        NIS = scan.nextInt();
        System.out.print("Tanggal Lahir :");
        TanggalLahir = scan.nextInt();
        System.out.println("==========================");
    //output
        System.out.println("Nama :"+Nama);
        System.out.println("NIS :"+NIS);
        System.out.println("Tempat Lahir :"+TempatLahir);
        System.out.println("Tanggal Lahir :"+TanggalLahir);
        System.out.println("Jenis Kelamin :"+JenisKelamin);
        System.out.println("Alamat di Malang :"+Alamat);
        System.out.println("Motto Hidup :"+Motto);
    }
    
}
