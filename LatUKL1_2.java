import java.util.Scanner;

public class LatUKL1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Tebakbilangan;
        System.out.println("Masukkan bilangan");
        Tebakbilangan = input.nextInt();
        
      if( Tebakbilangan % 2 == 0) {
   System.out.println("Bilangan genap");
        } else {
   System.out.println("Bilangan ganjil");
        }
    }
    
}
