package SerbestCalismalar;

import java.util.Objects;
import java.util.Scanner;

public class SQ05_ATMOtomation {

        public static void main(String[] args) throws InterruptedException {


            int hak = 2;


            System.out.println("                SAYIN JAVA, Ziraat Bankasina Hosgeldiniz             ");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Lütfen 4 Haneli Sifrenizi Giriniz: ");
            String GirilenSifre = scanner.nextLine().replaceAll("\\d", "*");
            System.out.println("Sifreniz : " + GirilenSifre);


            if ((GirilenSifre.length() == 4)) { // Bu KISIMDA JAVANIN ISLEMI KAPATMADAN TEKRAR CALISMASI ICIN LOOP!!
                //--------------------------------------------------------------------------------------------------------//
                System.out.println("\"1-Para Cekme \" + \" 2-Para Yatirma \" + \" 3-EFT\" + \" 4-Odemeler \" + \" 5-Hesap Ozeti \"");
                String secilenIslem = scanner.nextLine();
                switch (secilenIslem) {
                    case "1":
                        System.out.println("Para cekme");
                        break;
                    case "2":
                        System.out.println("Para Yatirma");
                        break;
                    case "3":
                        System.out.println("EFT");
                        break;
                    case "4":
                        System.out.println("Odemeler");
                        break;
                    case "5":
                        System.out.println("Hesap ozeti");
                        break;
                    default:
                        System.out.println("Hatali tuslama yaptiniz");
                        break;
                }
                if (secilenIslem.equals("1")) {
                    System.out.println("Lutfen cekmek istediginiz miktari seciniz\n" +
                            "1-50 TL\n" +
                            "2-100 TL\n" +
                            "3-200 TL\n" +
                            "4-500 TL\n" +
                            "5-Diger");
                    String SecilenMiktar = scanner.nextLine();
                    if (Objects.equals(SecilenMiktar, "1")) {
                        System.out.println("50 TL cekiliyor lutfen bekleyiniz...");
                        Thread.sleep(3000);
                        System.out.println("Lutfen Kartinizi Aliniz");
                    } else if (Objects.equals(SecilenMiktar, "2")) {
                        System.out.println("100 TL cekiliyor lutfen bekleyiniz...");
                        Thread.sleep(3000);
                        System.out.println("Lutfen Kartinizi Aliniz");
                    } else if (Objects.equals(SecilenMiktar, "3")) {
                        System.out.println("200 TL cekiliyor lutfen bekleyiniz...");
                        Thread.sleep(3000);
                        System.out.println("Lutfen Kartinizi Aliniz");
                    } else if (Objects.equals(SecilenMiktar, "4")) {
                        System.out.println("500 TL cekiliyor lutfen bekleyiniz...");
                        Thread.sleep(3000);
                        System.out.println("Lutfen Kartinizi Aliniz");
                    } else if (Objects.equals(SecilenMiktar, "5")) {
                        System.out.println("Lutfen Cekmek istediginiz miktari yaziniz");
                        int CekilecekMiktar = scanner.nextInt();
                        if (CekilecekMiktar > 5001) {
                            System.out.println("Gunluk Nakit Para Cekme Limitiniz 5000 TL yi asamaz");
                        } else {
                            System.out.println("Cekmek istediginiz " + CekilecekMiktar + " TL Hazirlaniyor Lutfen Bekleyiniz");
                            Thread.sleep(3000);
                            System.out.println("Isleminiz Basariyla Gerceklesmistir,Lutfen Kartinizi Aliniz");
                        }
                    }
                } else if (secilenIslem.equals("2")) {
                    System.out.println("Lutfen paranizi hazirlayiniz");
                    Thread.sleep(5000);
                    System.out.println("Lutfen paranizi ekranda gosterildigi gibi yerlestiriniz");
                    Thread.sleep(5000);
                    System.out.println("Para yatirma isleminiz gerceklesmistir,Lutfen kartinizi aliniz");
                } else if (secilenIslem.equals("3")) {
                    System.out.println("Lutfen EFT yapmak istediginiz hesabin 16 haneli iban numarasini giriniz");
                    String girilenIban = scanner.nextLine();
                    if (!(girilenIban.length() == 16)) {
                        System.out.println("Lutfen girilen Iban numarasinin 16 haneli oldugunu kontrol edin");
                    } else if (girilenIban.length() == 16) {
                        System.out.println("Lutfen gondermek istediginiz tutari giriniz");
                        int GonderilecekHavale = scanner.nextInt();
                        System.out.println(girilenIban + " a " + GonderilecekHavale + "TL gonderiliyor Lutfen bekleyiniz");
                        Thread.sleep(2000);
                        System.out.println("Isleminiz Basari ile gerceklesmistir,Lutfen makbuzunu ve kartinizi aliniz");
                    }
                } else if (secilenIslem.equals("4")) {
                    System.out.println("Lutfen odemesini yapmak istediginiz secenegi seciniz\n" +
                            "1-Elektrik\n" +
                            "2-su\n" +
                            "3-dogalgaz");
                    String odenecekFatura = scanner.nextLine();
                    if (Objects.equals(odenecekFatura, "1")) {
                        System.out.println("Lutfen 10 haneli Elektrik Abone numaranizi giriniz");
                        String ELaboneNo = scanner.nextLine();
                        if (!(ELaboneNo.length() == 10)) {
                            System.out.println("Lutfen elektrik faturanizi 10 hane olacak sekilde tekrar giriniz");
                        } else {
                            System.out.println("Faturaniz odeniyor Lutfen Bekleyiniz");
                            Thread.sleep(2000);
                            System.out.println("Elektrik Faturaniz Basarili bir sekilde odenmistir,Lutfen Kartinizi aliniz");
                        }
                    } else if (Objects.equals(odenecekFatura, "2")) {
                        System.out.println("Su abone numaranizi giriniz");
                        String suAboneNo = scanner.nextLine();
                        if (!(suAboneNo.length() == 8)) {
                            System.out.println("Lutfen Su abone numaranizi 8 hane olacak sekilde tekrar giriniz ");
                        } else {
                            System.out.println("Faturaniz odeniyor Lutfen Bekleyiniz");
                            Thread.sleep(2000);
                            System.out.println(" Su faturaniz Basarili bir sekilde odenmistir,Lutfen Kartinizi aliniz");
                        }
                    } else if (Objects.equals(odenecekFatura, "3")) {
                        System.out.println("Dogalgaz numaranizi giriniz");
                        String gasAboneNo = scanner.nextLine();
                        if (!(gasAboneNo.length() == 6)) {
                            System.out.println("Lutfem gas abone numaranizi 6 haneli olacak sekilde tekrardan girin");
                        } else {
                            System.out.println("Gas faturaniz odeniyor Lutfen Bekleyiniz");
                            Thread.sleep(2000);
                            System.out.println(" Su faturaniz Basarili bir sekilde odenmistir,Lutfen Kartinizi aliniz");
                        }
                    }
                } else if (secilenIslem.equals("5")) {
                    System.out.println("Lutfen Gormek istediginiz Hesap Ozetini Seciniz\n" +
                            "1-Kalan Bakiye\n" +
                            "2-Hesap Ozeti\n");
                    String SecilenHesapOzeti = scanner.nextLine();
                    if (Objects.equals(SecilenHesapOzeti, "1")) {
                        System.out.println("Kalan Bakiyeniz Makbuz Olarak yazdiriliyor Lutfen Bekleyiniz");
                        Thread.sleep(2000);
                        System.out.println("Kalan Bakiye Makbuzunuz Basariyla yazdirilmistir");
                        Thread.sleep(1000);
                        System.out.println("Lutfen Kartinizi aliniz");
                    } else if (Objects.equals(SecilenHesapOzeti, "2")) {
                        System.out.println("Hesap Ozetiniz Makbuz Olarak Yazdiriliyor Lutfen Bekleyiniz");
                        Thread.sleep(2000);
                        System.out.println("Hesap Ozetiniz Basariyla Yazdirilmistir");
                        Thread.sleep(1000);
                        System.out.println("Lutfen Kartinizi aliniz");
                    }
                } else {
                    System.out.println("Hatali Tuslama Yaptiniz");
                }
            } else {
                while (!(GirilenSifre.length() == 4 && hak > 0)) {
                    if (hak==1) {
                        System.err.println("Bu son Hakkiniz");
                    }
                    if (hak == 0) {
                        System.err.println("Hesabiniz Kilitlendi, Lutfen Banka ile iletisime geciniz.");
                        break;
                    } if (hak<=2){
                        System.err.println("Hatali Sifre Girimi Lutfen Tekrar Deneyiniz");
                        System.out.println("Lutfen 4 haneli Sifrenizi Giriniz: ");
                        GirilenSifre = scanner.nextLine().replaceAll("\\d", "*");
                        System.out.println("Sifreniz : " + GirilenSifre);
                        hak--;
                        if ((GirilenSifre.length() == 4)) { // Bu KISIMDA JAVANIN ISLEMI KAPATMADAN TEKRAR CALISMASI ICIN LOOP!!
                            //--------------------------------------------------------------------------------------------------------//
                            System.out.println("\"1-Para Cekme \" + \" 2-Para Yatirma \" + \" 3-EFT\" + \" 4-Odemeler \" + \" 5-Hesap Ozeti \"");
                            String secilenIslem = scanner.nextLine();
                            switch (secilenIslem) {
                                case "1":
                                    System.out.println("Para cekme");
                                    break;
                                case "2":
                                    System.out.println("Para Yatirma");
                                    break;
                                case "3":
                                    System.out.println("EFT");
                                    break;
                                case "4":
                                    System.out.println("Odemeler");
                                    break;
                                case "5":
                                    System.out.println("Hesap ozeti");
                                    break;
                                default:
                                    System.out.println("Hatali tuslama yaptiniz");
                                    break;
                            }
                            if (secilenIslem.equals("1")) {
                                System.out.println("Lutfen cekmek istediginiz miktari seciniz\n" +
                                        "1-50 TL\n" +
                                        "2-100 TL\n" +
                                        "3-200 TL\n" +
                                        "4-500 TL\n" +
                                        "5-Diger");
                                String SecilenMiktar = scanner.nextLine();
                                if (Objects.equals(SecilenMiktar, "1")) {
                                    System.out.println("50 TL cekiliyor lutfen bekleyiniz...");
                                    Thread.sleep(3000);
                                    System.out.println("Lutfen Kartinizi Aliniz");
                                } else if (Objects.equals(SecilenMiktar, "2")) {
                                    System.out.println("100 TL cekiliyor lutfen bekleyiniz...");
                                    Thread.sleep(3000);
                                    System.out.println("Lutfen Kartinizi Aliniz");
                                } else if (Objects.equals(SecilenMiktar, "3")) {
                                    System.out.println("200 TL cekiliyor lutfen bekleyiniz...");
                                    Thread.sleep(3000);
                                    System.out.println("Lutfen Kartinizi Aliniz");
                                } else if (Objects.equals(SecilenMiktar, "4")) {
                                    System.out.println("500 TL cekiliyor lutfen bekleyiniz...");
                                    Thread.sleep(3000);
                                    System.out.println("Lutfen Kartinizi Aliniz");
                                } else if (Objects.equals(SecilenMiktar, "5")) {
                                    System.out.println("Lutfen Cekmek istediginiz miktari yaziniz");
                                    int CekilecekMiktar = scanner.nextInt();
                                    if (CekilecekMiktar > 5001) {
                                        System.out.println("Gunluk Nakit Para Cekme Limitiniz 5000 TL yi asamaz");
                                    } else {
                                        System.out.println("Cekmek istediginiz " + CekilecekMiktar + " TL Hazirlaniyor Lutfen Bekleyiniz");
                                        Thread.sleep(3000);
                                        System.out.println("Isleminiz Basariyla Gerceklesmistir,Lutfen Kartinizi Aliniz");
                                    }
                                }
                            } else if (secilenIslem.equals("2")) {
                                System.out.println("Lutfen paranizi hazirlayiniz");
                                Thread.sleep(5000);
                                System.out.println("Lutfen paranizi ekranda gosterildigi gibi yerlestiriniz");
                                Thread.sleep(5000);
                                System.out.println("Para yatirma isleminiz gerceklesmistir,Lutfen kartinizi aliniz");
                            } else if (secilenIslem.equals("3")) {
                                System.out.println("Lutfen EFT yapmak istediginiz hesabin 16 haneli iban numarasini giriniz");
                                String girilenIban = scanner.nextLine();
                                if (!(girilenIban.length() == 16)) {
                                    System.out.println("Lutfen girilen Iban numarasinin 16 haneli oldugunu kontrol edin");
                                } else if (girilenIban.length() == 16) {
                                    System.out.println("Lutfen gondermek istediginiz tutari giriniz");
                                    int GonderilecekHavale = scanner.nextInt();
                                    System.out.println(girilenIban + " a " + GonderilecekHavale + "TL gonderiliyor Lutfen bekleyiniz");
                                    Thread.sleep(2000);
                                    System.out.println("Isleminiz Basari ile gerceklesmistir,Lutfen makbuzunu ve kartinizi aliniz");
                                }
                            } else if (secilenIslem.equals("4")) {
                                System.out.println("Lutfen odemesini yapmak istediginiz secenegi seciniz\n" +
                                        "1-Elektrik\n" +
                                        "2-su\n" +
                                        "3-dogalgaz");
                                String odenecekFatura = scanner.nextLine();
                                if (Objects.equals(odenecekFatura, "1")) {
                                    System.out.println("Lutfen 10 haneli Elektrik Abone numaranizi giriniz");
                                    String ELaboneNo = scanner.nextLine();
                                    if (!(ELaboneNo.length() == 10)) {
                                        System.out.println("Lutfen elektrik faturanizi 10 hane olacak sekilde tekrar giriniz");
                                    } else {
                                        System.out.println("Faturaniz odeniyor Lutfen Bekleyiniz");
                                        Thread.sleep(2000);
                                        System.out.println("Elektrik Faturaniz Basarili bir sekilde odenmistir,Lutfen Kartinizi aliniz");
                                    }
                                } else if (Objects.equals(odenecekFatura, "2")) {
                                    System.out.println("Su abone numaranizi giriniz");
                                    String suAboneNo = scanner.nextLine();
                                    if (!(suAboneNo.length() == 8)) {
                                        System.out.println("Lutfen Su abone numaranizi 8 hane olacak sekilde tekrar giriniz ");
                                    } else {
                                        System.out.println("Faturaniz odeniyor Lutfen Bekleyiniz");
                                        Thread.sleep(2000);
                                        System.out.println(" Su faturaniz Basarili bir sekilde odenmistir,Lutfen Kartinizi aliniz");
                                    }
                                } else if (Objects.equals(odenecekFatura, "3")) {
                                    System.out.println("Dogalgaz numaranizi giriniz");
                                    String gasAboneNo = scanner.nextLine();
                                    if (!(gasAboneNo.length() == 6)) {
                                        System.out.println("Lutfem gas abone numaranizi 6 haneli olacak sekilde tekrardan girin");
                                    } else {
                                        System.out.println("Gas faturaniz odeniyor Lutfen Bekleyiniz");
                                        Thread.sleep(2000);
                                        System.out.println(" Su faturaniz Basarili bir sekilde odenmistir,Lutfen Kartinizi aliniz");
                                    }
                                }
                            } else if (secilenIslem.equals("5")) {
                                System.out.println("Lutfen Gormek istediginiz Hesap Ozetini Seciniz\n" +
                                        "1-Kalan Bakiye\n" +
                                        "2-Hesap Ozeti\n");
                                String SecilenHesapOzeti = scanner.nextLine();
                                if (Objects.equals(SecilenHesapOzeti, "1")) {
                                    System.out.println("Kalan Bakiyeniz Makbuz Olarak yazdiriliyor Lutfen Bekleyiniz");
                                    Thread.sleep(2000);
                                    System.out.println("Kalan Bakiye Makbuzunuz Basariyla yazdirilmistir");
                                    Thread.sleep(1000);
                                    System.out.println("Lutfen Kartinizi aliniz");
                                } else if (Objects.equals(SecilenHesapOzeti, "2")) {
                                    System.out.println("Hesap Ozetiniz Makbuz Olarak Yazdiriliyor Lutfen Bekleyiniz");
                                    Thread.sleep(2000);
                                    System.out.println("Hesap Ozetiniz Basariyla Yazdirilmistir");
                                    Thread.sleep(1000);
                                    System.out.println("Lutfen Kartinizi aliniz");
                                }
                            } else {
                                System.out.println("Hatali Tuslama Yaptiniz");
                            }
                        }
                    }
                }
            }
        }
}