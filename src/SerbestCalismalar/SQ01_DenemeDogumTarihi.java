package SerbestCalismalar;

import java.util.Scanner;

public class SQ01_DenemeDogumTarihi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String adiniz;
        String soyadiniz;
        int yas;
        System.out.println("Lütfen adinizi Giriniz");
        adiniz=scan.nextLine();

        System.out.println("Lütfen Soyadinizi Giriniz");
        soyadiniz= scan.nextLine();

        System.out.println("yasinizi Giriniz");
        yas=scan.nextInt();

        int dogum= 2022-yas;

        System.out.println("Oooo " + dogum + " yilinda dogmussunuz");



    }
}