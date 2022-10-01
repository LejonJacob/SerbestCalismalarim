package SerbestCalismalar;

import java.util.Scanner;

public class SQ07_SayiTamKareKontrolu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean check=false;
        long sayi = scanner.nextLong(); // "sayi"nin girilmesi
        for (long i = 0; i <= sayi / 2 + 1; i++) { // (sayi/2 +1) kere dönen döngünün oluşturulması

            // Koşulun kontrol edilmesi
            if (sayi == i * i)
            {
                check = true;
                break; // Fazladan işlem yaptırmamak için tamkare bulunduğunda döngüden çıkarız
            }
        }
            // Koşulun sağlanıp sağlanmadığını kontrol etmek için "check"i kullandık, çünkü koşul sağlandığında "check" değişecek
            // Sonucun yazdırılması
        if (check){
            System.out.println("tam kare");

        } else
            System.out.println("tam kare degil");
        scanner.close();

    }
}
