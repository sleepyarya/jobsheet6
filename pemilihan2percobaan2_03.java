import java.util.Scanner;

public class pemilihan2percobaan2_03 {
    public static void main(String[] args) {
        Scanner tiga = new Scanner(System.in);

        System.out.println("=============MENU CAFE JTI=============");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("=======================================");
        System.out.print("Masukkan Angka yang ingin dipilih : ");
        int pilih = tiga.nextInt();
        tiga.nextLine();
        System.out.print("Apakah Punya Member (y/n) ? = ");
        String member = tiga.nextLine();
        System.out.println("=======================================");

        if (member.equalsIgnoreCase("y")) {
            double diskon = 0.10, harga;
            System.out.println("Besar diskon = 10%");
            if (pilih == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = "+ harga);
            }else if (pilih == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea  = "+ harga);
            }else if(pilih == 3 ){
                harga = 15000;
                System.out.println("Harga Bundling = "+ harga);
            }else{
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            double total = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = "+total);
        }else if(member.equalsIgnoreCase("n")){
            double harga;
            if (pilih == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = "+ harga);
            }else if (pilih == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea  = "+ harga);
            }else if(pilih == 3 ){
                harga = 15000;
                System.out.println("Harga Bundling = "+ harga);
            }else{
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            double total = harga;
            System.out.println("Total bayar = "+total);
        }


    }
}
