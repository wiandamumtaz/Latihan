
package pernyataan.pkgwhile;
import java.util.Scanner;
public class PernyataanWhile {

    public static void main(String[] args) {
    Scanner Masukkan = new Scanner(System.in);
    int a=0, total=0,bil=7;
    while (bil!=0){
        a++;
        System.out.print("Masukkan Bilangan ke-"+a+":");
        bil = Masukkan.nextInt();
        total += bil;
    }
        System.out.print("Total Jumlah"+(a-1)+"Bilangan ; ");
        System.out.println(total);
    }
    
}
