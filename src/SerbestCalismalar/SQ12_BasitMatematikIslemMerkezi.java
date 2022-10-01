package SerbestCalismalar;

import java.util.Scanner;

public class SQ12_BasitMatematikIslemMerkezi {
    public static void main(String[] args) {

        /*
          Basit bir islem merkezi olusturma
          Kullaniciya 4 tercih sunup istedigini gerceklestirecek 4 method olusturun
          1- girilen sayi asal sayi mi ?
          2- girilen sayi palindrome mu ?
          3- girilen sayiyi tam olarak bolen tamsayilarin adedi ?
          4- sayinin rakamlar toplami

          4 method'da string olarak sonucu donecek
          main method'da sonuc bir variable'a kaydedecek
          ve sonra yazdiracak

         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");


        int sayi1 = scanner.nextInt();
        System.out.println("Lütfen yapmak istediginiz islemi seciniz" +
                "\nA- Asal sayi mi?" +
                "\nB- Sayi palindrome mu?" +
                "\nC- Tam bolen sayisi kac tane " +
                "\nD- Sayinin rakamlar toplami kac?");
        char tercih = scanner.next().toUpperCase().charAt(0);
        String sonuc = "";

        switch (tercih) {
            case 'A':
                sonuc = AsalMi(sayi1);
                break;
            case 'B':
                sonuc = PalindromMu(sayi1);
                break;
            case 'C':
                sonuc = BolenSayisi(sayi1);
                break;
            case 'D':
                sonuc = RakamlarToplami(sayi1);
                break;

        } System.out.println("Sectiginiz Tercih Icin Sonuc : " + sonuc);

    }


    public static String AsalMi(int sayi1) {

        boolean flagAsalMi = true;
        String sonuc = "";

        for (int i = 2; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                sonuc = "Girdiginiz deger asal sayi degil";
                flagAsalMi = false;
                break;
            }
        }
        // burada nasil bir sonuc yazilmali
        // asal iken mi ? asal degilken mi ?
        if (flagAsalMi) {
            sonuc = "Girdiginiz deger asal sayi";
        }

        return sonuc;

    }

    public static String PalindromMu(int sayi1) {

        String cumle = sayi1 + "";
        String tersCumle = "";
        String sonuc = "";


        for (int i = cumle.length() - 1; i >= 0; i--) {
            tersCumle += cumle.charAt(i);
        }
        if (cumle.equalsIgnoreCase(tersCumle)) {
            sonuc = "Girdiginiz metin palindrome";

        } else {
            sonuc = "Girdiginiz metin palindrome degil";

        }
        return sonuc;

    }

    public static String BolenSayisi(int sayi1) {

        int tamBolenSayisi = 0;

        for (int i = 1; i <= sayi1; i++) {
            if (sayi1 % i == 0) {
                tamBolenSayisi++;
            }
        }

        return tamBolenSayisi + "";

    }

    public static String RakamlarToplami(int sayi1){

        String sayiStr=sayi1+"";
        int basSayisi = sayiStr.length();
        int birlerBas = 0;
        int rakamlarTop = 0;

        for (int i = 1; i < basSayisi; i++) {

            birlerBas=sayi1 % 10;
            rakamlarTop +=basSayisi;
            sayi1=sayi1/10;
            
        }

            return rakamlarTop+"";


    }


}