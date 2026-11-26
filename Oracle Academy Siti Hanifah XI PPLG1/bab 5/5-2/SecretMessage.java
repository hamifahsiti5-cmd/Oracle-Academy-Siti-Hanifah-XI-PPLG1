import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String decodedMessage = "";

        System.out.println("Masukkan 10 angka rahasia satu per satu:");

        while (count < 10) {
            System.out.print("Masukkan angka ke-" + (count + 1) + ": ");
            int input = scanner.nextInt();
            char letter;
            boolean valid = true;

            switch (input) {
                case 1:
                    letter = 'D';
                    break;
                case 2:
                    letter = 'W';
                    break;
                case 3:
                    letter = 'E';
                    break;
                case 4:
                    letter = 'L';
                    break;
                case 5:
                    letter = 'H';
                    break;
                case 6:
                    letter = 'O';
                    break;
                case 7:
                    letter = 'R';
                    break;
                default:
                    System.out.println("Angka belum terpecahkan! Masukkan angka lain.");
                    valid = false;
                    continue; // Lewat iterasi ini dan minta input ulang tanpa menambah count
            }

            if (valid) {
                decodedMessage += letter;
                count++;
            }
        }

        System.out.println("\nPesan yang diuraikan: " + decodedMessage);
        scanner.close();
    }
}
