package SerbestCalismalar;

import java.util.Scanner;

public class SQ03_KrediKartiOtomasyonu {
    public static void main(String[] args) {

        /*
         * Ask User Name, Surname and credit card numbers than convert it to special form
         *
         * (Check credit card number, if there aren’t 16 digit print
         * “Invalid credit card number”
         *
         * Input : John White 1234234534561478
         * Output : Name : J*** W****
         *          CCN  : **** **** **** 1478
         *          ExpD: 02/10 ,  CCV: **3
         *  (Initials for name and surname should be uppercase)
         *
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen Adinizi Giriniz");
        String isim=scanner.nextLine();
        System.out.println("Lütfen Soyadinizi Giriniz");
        String soyIsim=scanner.nextLine();
        System.out.println("Lütfen Kredi Karti Numaranizi Giriniz");
        String kartNo= scanner.nextLine();
        System.out.println("Lütfen Kredi Kartinizin Son kullanim tarihini giriniz");
        String sonTar=scanner.nextLine();
        System.out.println("Lütfen Kredi Kartinizin CVC numarasini giriniz");
        String ccvNo=scanner.next();



        String yeniAdSoyad= new String(isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\w", "*") + " " +
                soyIsim.substring(0, 1).toUpperCase()+
                soyIsim.substring(1).replaceAll("\\w", "*"));


        String yeniKartNo= kartNo.substring(0, 5).replaceAll("\\w", "*") +" "+
                kartNo.substring(5, 9).replaceAll("\\w", "*")+" "+
                kartNo.substring(9, 13).replaceAll("\\w", "*") + " "+
                kartNo.substring(kartNo.length()-5,kartNo.length()-1);


        String yeniCCV= ccvNo.substring(0,2).replaceAll("\\d", "*") + ccvNo.substring(ccvNo.length()-1);



        System.out.println(yeniAdSoyad + "\n"+ yeniKartNo + "\nExpD: "+sonTar + ",   CCV: "+ yeniCCV);


    }
}
