package ujian;

import java.util.Scanner;

public class SoalSatu {

    public String[] arrKata = getKata();
    public String[] getKata() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan kata = ");
        String kata = input.nextLine();
        input.close();
        kata = kata.toLowerCase();
        String[] arrKata = kata.split("");
        return arrKata;
    }
    public void cetakVokal() {
        System.out.println("Huruf vokal :");
        for ( int i = 0; i < arrKata.length; i++){
            if(arrKata[i].equalsIgnoreCase("a")|| arrKata[i].equalsIgnoreCase("i") || arrKata[i].equalsIgnoreCase("u") || arrKata[i].equalsIgnoreCase("e")||arrKata[i].equalsIgnoreCase("o")) {
                System.out.printf(arrKata[i]);
            }
        }
        System.out.println();
    }
    public void cetakKonsonan() {
        System.out.println("Huruf konsonan :");
        for ( int i = 0; i < arrKata.length; i++){
            if(!(arrKata[i].equalsIgnoreCase(" ")||(arrKata[i].equalsIgnoreCase("a")|| arrKata[i].equalsIgnoreCase("i") || arrKata[i].equalsIgnoreCase("u") || arrKata[i].equalsIgnoreCase("e")||arrKata[i].equalsIgnoreCase("o")))) {
                System.out.printf(arrKata[i]);
            }
        }
    }
    public static void main(String[] args) {
        SoalSatu soalSatu = new SoalSatu();
        soalSatu.cetakVokal();
        soalSatu.cetakKonsonan();


    }

}
