import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan alas segitiga (b): ");
        double b = in.nextDouble();

        System.out.print("Masukkan tinggi segitiga (h): ");
        double h = in.nextDouble();

        double area = 0.5 * b * h;

        System.out.println("Luas segitiga adalah: " + area);
        in.close();
    }
}