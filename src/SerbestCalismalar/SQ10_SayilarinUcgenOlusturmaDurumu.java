package SerbestCalismalar;

import java.util.Scanner;

public class SQ10_SayilarinUcgenOlusturmaDurumu {
    public static void main(String[] args) {

        /*
            Kullanicidan 3 tane pozitif  tam sayi alniz.
            bu üc sayinin ucgen olusturma durumunu kontrol ediniz
            eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol ediniz

             -üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük,
             -herhangi iki kenar farkı diger kenardan kücük olmali
             a+b>c>a-b
             a+c>b>a-c
             b+c>a>b-c
            a=b=c ise es kenar ucgen
*/
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen sirayla Üc(3) pozitif tamsayi giriniz");
        int kenarA= scanner.nextInt();
        int kenarB= scanner.nextInt();
        int kenarC= scanner.nextInt();



        if (kenarA==kenarB && kenarB==kenarC) {
            System.out.println("Eskenar Ucgen");
            
        } else if (kenarA+kenarB>kenarC && kenarC>kenarA-kenarB){
            System.out.println("Ücgen olusturur1");

        } else {
            System.out.println("ücgen olusturmaz");
        }


    }

}

