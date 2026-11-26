import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[5];
        double total = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Masukkan nilai tes ke-" + (i + 1) + " (0-100): ");
            scores[i] = scanner.nextDouble();
            total += scores[i];
        }

        double average = total / scores.length;
        System.out.println("Rata-rata nilai mahasiswa: " + average);
        scanner.close();
    }
}
