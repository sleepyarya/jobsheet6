import java.util.Scanner;

public class pemilihan2percobaan1_03 {
    public static void main(String[] args) {
        Scanner tiga = new Scanner(System.in);
        int tahun;
        System.out.println("Masukkan Tahun : ");
        tahun = tiga.nextInt();
        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun Kabisat");
            } else{
                if(tahun %400 == 0 )
                    System.out.println("Tahun Kabisat");
                else
                System.out.println("Bukan Tahun Kabisat");
            }
            
        } else {
            System.out.println("Bukan Tahun kabisat");
        }


        /*if((tahun %4 == 0 && tahun % 100 != 0) || tahun %400 == 0){
            System.out.println("kabisat");
        }else{
            System.out.println("Bukan");
        }*/
    }
}
    