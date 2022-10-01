package SerbestCalismalar;

import java.util.Scanner;

public class SQ06_MesafeveUcretHsplmaCoz2 {
    public static void main(String[] args) {


        /*

        A şehrinden uçamak isteyen bir kişi B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
        km birim fiyati : 0.10$
        12 yasindan kücükse toplam fiyat %50 indirim
        12 ve 24 yas arasindaysa 10% indirim
        65 yasindan buyukse 30% indirim
        gidis donus bilet alirsa yaş indirimlerinden hariç 20% indirim
        bu kosullara gore yolcudan gideceği mesafeyi isteyip ucak bilet ucretini hesaplayan program yazınız

        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Eger gidis donus biletiniz varsa E, yoksa H giriniz:");
        char gidisDonus= scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi tam sayi olarak giriniz");
        int yas= scan.nextInt();

        System.out.println("Lutfen gideceginiz sehrin mesafesini giriniz");
        int mesafe= scan.nextInt();

        // km birim fiyati 0.10$ oldugu icin mesafe ucretini 0.1 ile carparak indirimsiz ucret cikariyoruz
        // %20 indirim ucretin 0.8 ile carpilmasi manasina gelir ==> gidis donus bileti alinmasi durumu
        // %50 indirim ucretin 0.5 ile carpilmasi manasina gelir ==> 12 yasindan kucuk olunmasi durumu
        // %10 indirim ucretin 0.9 ile carpilmasi manasina gelir ==> 12 - 24 yas arasinda olunmasi durumu
        // %30 indirim ucretin 0.7 ile carpilmasi manasina gelir ==> 65 yasindan buyuk olunmasi durumu

        if (gidisDonus == 'E'){
            System.out.println("Toplam Fiyat : " + mesafe*0.1*0.8 + " $");

        }

        if (gidisDonus == 'H' && yas>=65) {
            System.out.println("Toplam Fiyat : " + mesafe*0.1*0.7 + " $");
        } else if (gidisDonus == 'H' && yas>=24) {
            System.out.println("Toplam Fiyat : " + mesafe*0.1*1 + " $");

        } else if (gidisDonus == 'H' && yas>=12) {
            System.out.println("Toplam Fiyat : " + mesafe*0.1*0.9 + " $");
        } else if (gidisDonus == 'H' && yas<12) {
            System.out.println("Toplam Fiyat : " + mesafe*0.1*0.5 + " $");
        } else {
            System.out.println("Girilen bilgileri kontrol ediniz");
        }

        scan.close();

    }
}

