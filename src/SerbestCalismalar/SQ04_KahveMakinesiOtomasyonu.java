package SerbestCalismalar;

import java.util.Scanner;

public class SQ04_KahveMakinesiOtomasyonu {
    public static void main(String[] args) throws InterruptedException {

       /*
        1. Basit bir Kahve makinesi oluşturun. 3 çeşit kahvemiz olsun.
        2. Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
        3. Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
        Örn:	Hangi Kahveyi İstersiniz?	1.Türk kahvesi	2.Filtre Kahve	3.Espresso
        String hangiKahve oluşturun ve var olan kahvelerden birini yazınız.     (örn: Türk Kahvesi,  ya da türk kahvesi.  --->  Büyük- küçük harf duyarlı olmaması için String methodu kullanın.)
        -------------------------------------------------todo 1. Koşul bölümü----------------------------------------------------------
                Eğer kahve Türk kahvesi ise,
                konsola = "Türk kahvesi hazırlanıyor." yazsın.(Dümdüz Türk kahvesi yazmayın. String hangiKahve'yi çağırın!!)
        Eğer filtre kahve ise,   konsola = "Filtre kahve hazırlanıyor."  yazsın.     (String hangiKahve'yi kullanın !)
        Eğer Espresso ise, konsola =  "Espresso hazırlanıyor."   yazsın.  (String hangiKahve'yi kullanın !)
        Eğer yanlış harf girerseniz, konsola = "Hatalı tuşlama yaptınız." yazsın. (Hatalı tuslamadan sonra kod calısmaya devam edecektir, o konuyu daha görmediniz bu yüzden bastan baslatın.)
        Sistem bize şu soruyu sorsun: "Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):    "
        Konsolda aynen böyle  yazmalı. Parantez içi de konsolda olsun.
        --------------------------------------------------todo 2.Koşul Bölümü-----------------------------------------
                String sut olusturun.
        Eğer String sut,  evet'e eşitse, konsola, Süt ekleniyor... yazısı gelsin.
        (Büyük küçük harf duyarlı olmaması için String methodu kullanın. Olması gereken ihtimaller: Evet, EVET, EvEt,EVEt vs.
        eğer String sut, hayır a eşit ise, konsola , Süt eklenmiyor  yazısı gelsin.
                ------------------------------------------todo 3.Koşul Bölümü------------------------------------
                Sistem bize "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : " şeklinde bir soru sorsun.
        (Büyük küçük harf duyarlılıgı olmaması için string method kullanın.
        String seker oluşturunuz.
        if(){    Eğer String seker   Evet e eşitse ,
            sistem bize "Kaç şeker olsun?" sorusunu sormalı. Sorunun altına int kacSeker  oluşturunuz.    Şeker sayısını giriniz.
                    Ve konsola   şunu yazdırınız örnek: 5 şeker ekleniyor.  (ipucu: Bu kodların hepsi if bloğunun içerisinde olacak}
        else{	Eğer String şeker  hayır 'a eşitse, sistem bize "Şeker eklenmiyor" cevabını versin.
            ONEMLİ !! =   bir int girdisinden sonra String girdisi yapacaksak, araya boş bir nextLine koymamız gerekiyor.
            (String bosKod = sc.nextLine();    )  dummy kod ekleyiniz.
            ----------------------------------------------todo 4.Koşul Bölümü------------------------------------
                    Sistem bize "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :   sorusunu sorsun.
            (büyük küçük harf duyarlılıgı olmamalı. yani kullanıcı büyük boy veya BüYüK Boy girdiginde kabul etmeli.
            String boyut oluşturun...
            Eğer String boyut Büyük boy' a eşitse =  Kahveniz büyük boy hazırlanıyor. (Büyük boy kısmını String boyut'u kullanarak yazalım= "Kahveniz" + boyut + "hazırlanıyor.")
            Eğer String boyut  Orta Boy'a eşitse = Kahveniz orta boy hazırlanıyor.. ("Kahveniz" + boyut + "hazırlanıyor.)
            Eğer String boyut  Küçük boy'a eşitse = Kahveniz küçük boy hazırlanıyor.    yazsın. ("Kahveniz" + boyut + "hazırlanıyor.)
                    --------------------------------------------------SONUÇ BÖLÜMÜ-------------------------------------------------
                    Siparişlerimizi verdik. Son hali görmek istiyoruz.
            Konsola şunu yazdırın örnek :    Türk Kahvesi orta boy hazırdır. Afiyet olsun !!!
            (Türk kahvesi için String hangiKahveyi kullanın.     orta boy için de String boyut ' u kullanın.)

            */

        System.out.println("                 Merhaba, Ne icmek istersiniz?              ");
        System.out.println("A-Türk kahvesi " + " B-Filtre Kahve " + " C-Espresso " + " D-Latte " + " E-Sicak Cikolata ");

        System.out.print("Lütfen Tercihinizi yapin: ");
        Scanner scanner=new Scanner(System.in);
        String kahveTercihi= scanner.nextLine().toUpperCase();


        if (! (kahveTercihi.equals("A") || kahveTercihi.equals("B") || kahveTercihi.equals("C") ||
                kahveTercihi.equals("D") || kahveTercihi.equals("E")) ){
            System.out.println("Hatali tuslama yaptiniz");

            return;

        }



//----------------------------------------- TODO 1. Koşul Bölümü -------------------------------------------//
//***************************************** Ustte Kahve Tercih Satiri *********************************************//

        System.out.println("Süt eklememizi ister misiniz ?" + "\nEVET:     HAYIR: ");
        String sutSecimi= scanner.nextLine().toUpperCase();

        switch (sutSecimi){
            case "E":
                sutSecimi=" Sütlü";
                System.out.println("Süt ekleniyor...\n");
                Thread.sleep(2000);
            break;

            case "H":
                sutSecimi=" Sade";
                Thread.sleep(1000);
                System.out.println("Süt eklenmeyecek...\n");
            break;

            default:
                System.out.println("Hatali tuslama yaptiniz.\n");

                return;
        }


//----------------------------------------- TODO 2. Koşul Bölümü -------------------------------------------//
//***************************************** Üstte Süt Tercihi Satiri ***********************************************//

        System.out.println("Seker eklemek ister misiniz ?" + "\nEVET:     HAYIR: ");
        String sekerSecimi= scanner.nextLine().toUpperCase();


        switch (sekerSecimi){
            case "E":
                System.out.println("Lütfen seker miktarini giriniz");
                int sekerMiktari;

                while(!scanner.hasNextInt()){
                    System.out.println("Hatali tuslama yaptiniz.");
                    System.out.println("Lütfen seker miktarini sayi olarak giriniz");
                    scanner.nextLine();
                }
                sekerMiktari = scanner.nextInt();
                System.out.println(sekerMiktari + " adet seker ekleniyor...\n");

                sekerSecimi=sekerMiktari+" Sekerli";
                Thread.sleep(2000);
                String bosKod = scanner.nextLine();
            break;

            case "H":
                Thread.sleep(1000);
                System.out.println("Seker eklenmeyecek...\n");
                sekerSecimi="Sekersiz ";
            break;

            default:
                System.out.println("Hatali tuslama yaptiniz.\n");

                return;
        }


//----------------------------------------- TODO 3. Koşul Bölümü -------------------------------------------//
//***************************************** Üstte Seker Tercihi Satiri *************************************//


        System.out.println("                   Lütfen Bardak Boyutunu Seciniz                 ");
        System.out.println("B- Büyük Boy " + " O- Orta Boy " + " K- Kücük Boy");
        String bBoy= "Büyük boy";
        String oBoy= "Orta boy";
        String kBoy= "Kücük boy";
        String bardakSecimi= scanner.nextLine().toUpperCase();

        switch (bardakSecimi)
        {
            case "B":
                Thread.sleep(500);
                bardakSecimi=bBoy;
                break;

            case "O":
                Thread.sleep(500);
                bardakSecimi=oBoy;
                break;

            case "K":
                Thread.sleep(500);
                bardakSecimi=kBoy;
                break;

            default:
                System.out.println("Hatali tuslama yaptiniz");

               return;

        }

//----------------------------------------- TODO 4. Koşul Bölümü -------------------------------------------//
//***************************************** Bardak Boyutu Tercihi Satiri *************************************//

        switch (kahveTercihi)
        {
            case "A":
                System.out.println(sekerSecimi + sutSecimi + " Türk Kahveniz hazırlanıyor...");
                Thread.sleep(2000);
                System.out.println(bardakSecimi + " Türk kahveniz hazır, Afiyet olsun !!!");
                break;

            case "B":
                System.out.println(sekerSecimi + sutSecimi + " Filtre Kahveniz hazırlanıyor...");
                Thread.sleep(2000);
                System.out.println(bardakSecimi + " Filtre kahveniz hazır, Afiyet olsun !!!");
                break;

            case "C":
                System.out.println(sekerSecimi + sutSecimi + " Espressonuz hazırlanıyor...");
                Thread.sleep(2000);
                System.out.println(bardakSecimi + " Espressonuz hazır, Afiyet olsun !!!");
                break;

            case "D":
                System.out.println(sekerSecimi + sutSecimi + " Latteniz hazırlanıyor...");
                Thread.sleep(2000);
                System.out.println(bardakSecimi + " Latteniz hazır, Afiyet olsun !!!");
                break;

            case "E":
                System.out.println(sekerSecimi + sutSecimi + " Sicak Cikolataniz hazırlanıyor...");
                Thread.sleep(2000);
                System.out.println(bardakSecimi + " Sicak Cikolataniz hazır, Afiyet olsun !!!");
                break;

            default:
                System.out.println("Hatali tuslama yaptiniz");

                return;

        }

        scanner.close();

    }
}
