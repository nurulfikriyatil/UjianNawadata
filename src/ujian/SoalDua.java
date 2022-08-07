package ujian;

import java.util.Arrays;
import java.util.Scanner;

public class SoalDua {

    public int family = getFamily();
    public int[] memberInt = getMember();

    public int getFamily(){
        System.out.println("Masukan jumlah keluarga : ");
        Scanner scanner = new Scanner(System.in);
        Integer family = scanner.nextInt();
        return family;
    }
    public int[] getMember(){
        System.out.println("Masukkan jumlah member keluarga :");
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String member = scanner.next();
        String[] arrMember = member.split(" ");
        int [] memberInt = new int[arrMember.length];
        for (int i=0; i<memberInt.length; i++){
            memberInt[i] = Integer.valueOf(arrMember[i]);
        }
        return memberInt;
    }

    public int jumlahMember(){
        int jumlah = 0;
        for( int i = 0; i < memberInt.length; i++){
            jumlah = jumlah + memberInt[i];
        }

        return jumlah;
    }
    public int jumlahBis(){
        int jumlahMember = jumlahMember();
        int kapsitasBus = 4;
        int jumlahBus;
        if (jumlahMember % kapsitasBus == 0){
            jumlahBus = jumlahMember/kapsitasBus;
        }else {
            jumlahBus = jumlahMember/kapsitasBus + 1;
        }
        return jumlahBus;
    }
    public void cetak(){
        System.out.println(family);
        System.out.println(Arrays.toString(memberInt));
        if (family != memberInt.length){
            System.out.println("Input must be equal with count of family");
        } else {
            System.out.println("Jumlah minimal bis : " + jumlahBis());
        }
    }

    public static void main(String[] args) {
        SoalDua soalDua = new SoalDua();
        soalDua.cetak();
    }

}
