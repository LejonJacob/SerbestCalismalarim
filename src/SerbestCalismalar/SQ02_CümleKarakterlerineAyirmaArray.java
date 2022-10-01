package SerbestCalismalar;

import java.util.Arrays;
import java.util.Scanner;

public class SQ02_CümleKarakterlerineAyirmaArray {
    public static void main(String[] args) {

        /*
         * Create a custom return type method accepts a name as parameter
         * and prints the name as a char array
         *
         * (do not use toCharArray() method)
         *
         * Input : John
         * Output : [J, o, h, n]
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir kelime veya cümle giriniz");
        String kelime= scanner.next();

        harfAyirmaArr(kelime);


    }

    public static void harfAyirmaArr(String kelime) {

        char[] cikti=new char[kelime.length()];

        for (int i = 0; i < kelime.length(); i++) {

            cikti[i]= kelime.charAt(i);

        }
        System.out.println(Arrays.toString(cikti));
    }
}
