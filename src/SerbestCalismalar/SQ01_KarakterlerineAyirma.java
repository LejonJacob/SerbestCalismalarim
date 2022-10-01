package SerbestCalismalar;

import java.util.Scanner;

public class SQ01_KarakterlerineAyirma {
    public static void main(String[] args) {

    /*

     * Kullanicidan bir kelime ve cumle aliniz
     * Kelimeyi cumle icinde aratip konsola yazdiriniz
     *
     * Orn : Cumle = "hihihi" String = "hi" output = "hihihi" ' nin icinde 3 tane "hi" var
                * Orn : Cumle = "Yoldayim" String = "yol" output = "Yoldayim" in icinde 1 tane "yol" var
                *
     * Case sensitivity ignore et!
     */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir Cümle giriniz");
        String cumle= scanner.nextLine();
        System.out.println("Lütfen bir kelime giriniz");
        String kelime= scanner.nextLine();


        int sayac=0;

        for (int i = 0; i <= cumle.length()-kelime.length() ; i++) {


            if (cumle.substring(i, i+kelime.length()).equalsIgnoreCase(kelime)) {
                sayac++;
            }

        }
         if (sayac>0){
            System.out.println("Aradiginiz kelime cümlede " + sayac + " defa kullanilmistir");

        }else {
            System.out.println("Cümle aradiginiz kelimeyi icermiyor");
        }


    }
}
