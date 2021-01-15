
package counter;
import java.util.Scanner;
public class Counter {
    public static void main(String[] args) {
        Scanner Masukkan = new Scanner(System.in);
        System.out.println("Masukkan Batas Bilangan :");
        int Batas = Masukkan.nextInt();
        int hasil =0;
        for(int i=1; i<=7; i++)
            hasil +=i;
        System.out.println("Total Jumlahnya adalah :"+hasil);
    }
    
}
