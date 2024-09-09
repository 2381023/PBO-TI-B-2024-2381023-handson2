import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka pertama: ");
        float angka1 = input.nextFloat();

        System.out.println("Pilih operator: ");
        char operator = input.next().charAt(0);

        System.out.println("Masukkan angka kedua: ");
        float angka2 = input.nextFloat();

        System.out.println("data yang anda input adalah: " + angka1 + " " + operator + " " + angka2);

        // operator yang tersedia (* / + - %)
        double hasil;
        switch (operator){
            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil nya adalah: " + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println("Hasil nya adalah: " + hasil);
                break;
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil nya adalah: " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil nya adalah: " + hasil);
                break;
            default:
                System.out.println("Operator yang anda pilih tidak valid");
        }
    }

}