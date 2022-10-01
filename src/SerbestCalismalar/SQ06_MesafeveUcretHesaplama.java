package SerbestCalismalar;

import java.util.Scanner;

public class SQ06_MesafeveUcretHesaplama {
    public static void main(String[] args) {

        /*
            A şehrinden uçmak isteyen bir kişi B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
            km birim fiyati : 0.10$
            12 yasindan kucukse toplam fiyat %50 indirim
            12 ve 24 yas arasindaysa 20% indirim
            24 ten büyük 65 ten de kücükse 10% indirim
            65 yasindan buyukse 30% indirim
            gidis donus bilet alirsa yaş indirimlerinden hariç 20% indirim
            bu kosullara gore yolcudan gideceği mesafeyi isteyip ucak bilet ucretini hesaplayan program yazınız
        */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen gideceginiz mesafeyi giriniz");
        int mesafe= scanner.nextInt();
        System.out.println("Lütfen yasinizi giriniz");
        int yas=scanner.nextInt();
        System.out.println("Lütfen gidis gelis biletiniz varsa 'E' yoksa 'H' seciniz");
        char biletyonu=scanner.next().toUpperCase().charAt(0);

        if (biletyonu=='E') {
            if (yas < 12) {
                System.out.println("Ödeyeceginiz toplam ücret : " + (mesafe * 0.3 * 0.10) + " $");
            } else if (yas <= 24) {
                System.out.println("Ödeyeceginiz toplam ücret : " + (mesafe * 0.6 * 0.10) + " $");

            } else if (yas < 65) {
                System.out.println("Ödeyeceginiz toplam ücret : " + (mesafe * 0.7 * 0.10) + " $");

            } else {
                System.out.println("Ödeyeceginiz toplam ücret : " + (mesafe * 0.5 * 0.10) + " $");
                }
            }

            else { if (biletyonu=='H') {

                if (yas < 12) {
                System.out.println("Ödeyeceginiz toplam ücret : " + (mesafe * 0.5 * 0.10) + " $");
                } else if (yas <= 24) {
                System.out.println("Ödeyeceginiz toplam ücret : " + (mesafe * 0.8 * 0.10) + " $");

                } else if (yas < 65) {
                System.out.println("Ödeyeceginiz toplam ücret : " + (mesafe * 0.9 * 0.10) + " $");

                } else {
                System.out.println("Ödeyeceginiz toplam ücret : " + (mesafe * 0.7 * 0.10) + " $");
                }
            }
        }

    }
}
