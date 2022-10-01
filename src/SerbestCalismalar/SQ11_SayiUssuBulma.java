package SerbestCalismalar;

import java.util.Scanner;

public class SQ11_SayiUssuBulma {
    public static void main(String[] args) {


         /*
         Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop kullanarak verilen sayinin
         istenen üssünü hesaplayip yazdiran bir method olusturun.
         */

        Scanner scanner= new Scanner(System.in);

        int sayi=5;
        int Us=3;

        long sonuc=1;

        while (Us !=0){
            sonuc *=sayi;
            --Us;
        }
        System.out.println("Girilen sayinin üssü :  "+ sonuc);


    }
}
