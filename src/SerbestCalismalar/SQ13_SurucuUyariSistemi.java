package SerbestCalismalar;

import java.util.Random;

public class SQ13_SurucuUyariSistemi {
    public static void main(String[] args) {


        // Bir araba yarışında yardımcı pilotluk yaptığınızı ve parkurun
        // özelliklerine göre pilota yardım etmekle görevli olduğunuz bir durumu düşünelim.
        // Hızın 100’den fazla olduğu durumlarda pilotunuzu hızı 100’e kadar düşürmesi konusunda uyarmanız lazım.

        Random maximumHiz =new Random(); //random sınıfı
        int hiz =maximumHiz.nextInt(240);

        while (hiz > 100) {
            System.out.println("Şu andaki hızın :" + hiz+ " km/s");

            if (hiz > 150) {
                System.out.println("Cok çabuk yavaşlaman lazım!");
                hiz= hiz-20;

            } else {
                System.out.println("Yavaşla!");
                hiz= hiz - 10;
            }
        }

        if (hiz <= 100) {
            System.out.println("Şu andaki hızın :" + hiz + " km/s hizinizi arttirin");

        }



//TODO*****************************************       1      ************************************************************

         /*int i=0;

        while (i<10){

            System.out.println("Java");

            i++;
        }
        System.out.println("Döngü Bitti: " + i);

         */


//TODO*****************************************       2      ************************************************************

        /*

        // Kullanicidan 100 den kücük bir sayi alip 100'a kadar olan sayilari yazdiralim

        Scanner scan= new Scanner(System.in);
        System.out.print("Lütfen Bir Sayi Giriniz: ");

        int a= scan.nextInt();

        int baslangicAdegeri=a;

        while(a <= 100) {

            System.out.println(a);
            a++;
        }
        System.out.println("Baslangictaki 'a' Degeri: " + baslangicAdegeri);
        System.out.println("Son 'a' Değeri: "+a);

         */



//TODO*****************************************       3      ************************************************************

        /*

        // Kullanicidan 10 den kücük bir sayi alip faktöriyelini hesaplayalim

        Scanner scan= new Scanner(System.in);
        System.out.print("Lütfen Bir Sayi Giriniz: ");

        int sayi= scan.nextInt();
        int baslangictakiSayi=sayi;

        int faktoriyel=1;

        while (sayi>=1){

            faktoriyel=faktoriyel*sayi;

            sayi--;
        }


        System.out.println(baslangictakiSayi+"! faktöriyel sonucu: " + faktoriyel);
        System.out.println("Loop sonu Sayimizin Output'u: " + sayi);


         */



//TODO*****************************************       4      ***********************************************************

        /*

        // Bir sayının tam bölenlerini ve tam bölenlerinin toplamını bulun.

        Scanner scan= new Scanner(System.in);
        System.out.print("Lütfen Bir Sayi Giriniz: ");
        int sayi= scan.nextInt();

        int bolen = 1; // Bir sayinin en kücük böleni 1 oldugu icin böleni 1 aldik
        int tamBolenlerToplami = 0;

        while(bolen <=sayi ) {
        // Bölen sayimiz loopun icinde kosul gerceklestigi sürece birer birer
        // artacak ve en sonda girdigimiz sayidan büyük olunca döngü kirilacak ve islemi sonlandiracak

            if(sayi % bolen == 0) {
                // 2. kosul girdigimiz sayinin loop tarafindan i++; artirilan bölen sayisina
                // tam bölünüm bölünmediginin kontrolünü yapma kismi

                System.out.println(sayi+" sayısı "+bolen+" sayısına tam bölünür."); // Yazdirma kismi

                tamBolenlerToplami = tamBolenlerToplami+bolen;
                // tüm kosullar saglanmisa sayinin tam bölen'lerini toplayip yeniden atama yapiyoruz
            }
            bolen++; // bölen <= sayi odugu sürece bölenimizi birer artirip loopun basina dönüyoruz
        }

        // Loop kirildiginda bize döndürülecek ve yazdirilacak kisim
        System.out.println("\n"+sayi+" sayısının tam bölenlerinin toplamı: "+tamBolenlerToplami);


        */


//TODO*****************************************       5      ***********************************************************

        /*

        // While döngüsünü kullanarak kullanıcının istediği kadar sayıyı toplayabildiği bir uygulama yazalim

        Scanner scan = new Scanner(System.in);

        int girdi=-1;

        int toplam = 0;
        int adet = 1;
        System.out.print("Toplanacak Sayıları Girin (Islemi Bitirmek için 0 girin)\n\n");

        while( girdi != 0) {

            System.out.print(adet+". Sayı: ");
            girdi = scan.nextInt();
            toplam = toplam + girdi;
            adet++;

        }
        System.out.println("\n\nToplam: "+toplam);


        */


//TODO*****************************************       6      ***********************************************************

        /*

        // Bir Arrayin icindeki elementlerin toplamini bulalim

        int[] arr = {20, 10, 40, 50, 30};

        int i = 0;

        int arrToplami = 0;

        while (i < arr.length) {

            arrToplami = arrToplami + arr[0];
            i++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Array Elementlerinin toplami: " + arrToplami);
        System.out.println("Array'in Lenght'i: " + i);



         */


//TODO*****************************************       7      ***********************************************************


        /*

        int sayi = (int)(Math.random() * 101); //0 ile 100 arasında bir sayı üretir 100'de olabilir

        Scanner input = new Scanner(System.in); //Kullanıcıdan sayı alabilmek için Scanner sınıfını kullandık

        int tahmin = -1; //0 ile 100 arasında olmaması için -1 verdik

        while(sayi != tahmin){ // sayı tahmine eşit olmadığı sürece true dönecek ve bu işlem tekrarlanacak . Sayı işleme eşit olduğunda false dönecek ve döngüye girmiyecek

            System.out.print("Tahmin ettiğiniz sayıyı giriniz: ");

            tahmin = input.nextInt(); // Sayı kullanıcıdan alınır

            if(tahmin == sayi){
                System.out.println("Doğru Tahmin");

            }else if(tahmin > sayi){
                System.out.println("Tahmininizi Azaltın");

            }else{
                System.out.println("Tahmininizi Arttırın");

            }
        }

        */

    }
}
