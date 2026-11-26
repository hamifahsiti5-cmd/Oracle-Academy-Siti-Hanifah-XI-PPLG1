import java.util.Scanner;

public class TernaryExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai x: ");
        double x = input.nextDouble();

        boolean hasil = (x <= 7) ? true : false;

        System.out.println("Hasil: " + hasil);

        input.close();
    }
}