import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.println("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        System.out.println("Masukkan angka ketiga: ");
        int angka3 = input.nextInt();

        int maksimum = Math.max (angka1, Math.max(angka2, angka3));
        System.out.println("angka maksimum nya adalah: " + maksimum);

        int minimum = Math.min (angka1, Math.min(angka2, angka3));
        System.out.println("angka minimum nya adalah: " + minimum);
    }
}
