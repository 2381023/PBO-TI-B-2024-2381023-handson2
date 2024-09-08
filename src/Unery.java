public class Unery {
    public static void main(String[] args) {
        int x = 10;
        int y = -5;
        boolean isTrue = true;
        // Increment
        System.out.println("x awal: " + x);
        System.out.println("++x: " + ++x);// Pre - increment
        System.out.println("x++: " + x++); // Post - increment
        System.out.println("x akhir: " + +x);

        // Decrement
        System.out.println("x awal: " + x);
        System.out.println("++x: " + --x);// Pre - increment
        System.out.println("x++: " + x--); // Post - increment
        System.out.println("x akhir: " + +x);

        // Unary plus dan minus
        System.out.println("+x: " + x);
        System.out.println("-x: " + -y);

        System.out.println("+x: " + x);
        System.out.println("-x: " + -y);

        // Logical Not
        System.out.println("!isTrue: " + !isTrue);
    }
}
