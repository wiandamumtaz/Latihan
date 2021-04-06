
package Latihan;

public class Wianda extends Siswa {
    public static void main(String[] args) {
        Siswa Data = new Siswa();
        
        Data.setNama("Wianda");
        Data.setNama("Rayhan");
        Data.setKelamin("Perempuan");
        Data.setUmur(16);
        Data.setTahunKelahiran(2004);
        Data.setNisn(165784325);
        
        System.out.println("Nama : "+ Data.getNama());
        System.out.println("Kelamin : "+ Data.getKelamin());
        System.out.println("Umur "+ Data.getUmur());
        System.out.println("Tahun Kelahiran :"+ Data.getTahunKelahiran());
        System.out.println("Nisn : "+ Data.getNisn());
        
        System.out.println("---------------------------------------------");
        
        Data.setNama("Rayhan");
        Data.setKelamin("Laki-Laki");
        Data.setUmur(16);
        Data.setTahunKelahiran(2004);
        Data.setNisn(165784325);
                
        System.out.println("Nama : "+ Data.getNama());
        System.out.println("Kelamin : "+ Data.getKelamin());
        System.out.println("Umur "+ Data.getUmur());
        System.out.println("Tahun Kelahiran :"+ Data.getTahunKelahiran());
        System.out.println("Nisn : "+ Data.getNisn());
       }
}
