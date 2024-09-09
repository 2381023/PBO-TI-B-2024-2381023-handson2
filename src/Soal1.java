import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.println("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        int maksimum = Math.max (angka1, angka2);
        System.out.println("angka maksimum nya adalah: " + maksimum);

        int minimum = Math.min (angka1, angka2);
        System.out.println("angka minimum nya adalah: " + minimum);
    }
}
