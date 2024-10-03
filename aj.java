import java.util.Scanner;

public class aj {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a, b, total;
        System.out.println("Masukkan angka : ");
        a = s.nextDouble();
        System.out.println("Masukkan angka : ");
        b = s.nextDouble();
        total = a*b;
        System.out.println("total = " +total);
    }
}
