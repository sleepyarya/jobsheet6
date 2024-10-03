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

        if (member.equals("y")) {
            double diskon = 0.10, harga;
            System.out.println("Besar diskon = 10%");
            if (pilih == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (pilih == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea  = " + harga);
            } else if (pilih == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            double total = harga - (harga * diskon);
            System.out.println("=======================================");
            System.out.println("Pilih metode pembayaran : (qriz/tunai) ?");
            String metode = tiga.nextLine();
            System.out.println("=======================================");
            if (metode.equalsIgnoreCase("qriz")) {
                total = total - 1000;
                System.out.println("diskon qriz = " + 1000);
                System.out.println("total harga = " + total);
            } else {
                total = harga;
                System.out.println("total harga = " + total);
            }

            System.out.println("Total bayar setelah diskon = " + total);
        } else if (member.equalsIgnoreCase("n")) {
            double harga;
            if (pilih == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (pilih == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea  = " + harga);
            } else if (pilih == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            System.out.println("=======================================");
            System.out.println("Pilih metode pembayaran : (qriz/tunai) ?");
            String metode = tiga.nextLine();
            System.out.println("=======================================");
            double total;
            if (metode.equalsIgnoreCase("qriz")) {
                total = harga - 1000;
                System.out.println("diskon qriz = " + 1000);
                System.out.println("total harga = " + total);
            } else {
                total = harga;
                System.out.println("total harga = " + total);
            }

        }

    }
}
