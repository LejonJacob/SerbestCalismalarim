package SerbestCalismalar;

import java.util.Scanner;

public class SQ09_FizBuzzYazdirma {
    public static void main(String[] args) {

        /*
         Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum tamsayilari yazdirin, sira
        - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        - 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin
         */


        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen 14'ten Büyük Bir sayi yazin");
        //Tüm sartlari saglamasi amaciyla 14'ten büyük sayi istenmistir.

        int sayi= scan.nextInt();

        for (int i = 1; i <=sayi ; i++) {

            if ((i %3==0 && i %5==0)){
                System.out.print("fizzBuzz ");

            } else if (i %3==0) {
                System.out.print("Fizz ");

            } else if (i %5==0) {
                System.out.print("Buzz ");

            } else System.out.print(i + " ");

        }


    }

}
