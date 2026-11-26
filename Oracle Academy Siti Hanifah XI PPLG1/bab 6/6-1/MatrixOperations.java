import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan ukuran matriks persegi (misal 2 untuk 2x2 atau 3 untuk 3x3): ");
        int n = scanner.nextInt();

        int[][] matrixA = new int[n][n];
        int[][] matrixB = new int[n][n];
        char choice;

        do {
            System.out.println("\n=== MENU OPERASI MATRIKS ===");
            System.out.println("a. Masukkan Matriks A");
            System.out.println("b. Masukkan Matriks B");
            System.out.println("c. Tampilkan A + B");
            System.out.println("d. Tampilkan A - B");
            System.out.println("e. Tampilkan A * B");
            System.out.println("f. Keluar");
            System.out.print("Pilih opsi (a-f): ");
            choice = scanner.next().toLowerCase().charAt(0);

            switch (choice) {
                case 'a':
                    System.out.println("Input elemen Matriks A:");
                    inputMatrix(scanner, matrixA);
                    break;
                case 'b':
                    System.out.println("Input elemen Matriks B:");
                    inputMatrix(scanner, matrixB);
                    break;
                case 'c':
                    System.out.println("Hasil A + B:");
                    printMatrix(addMatrices(matrixA, matrixB));
                    break;
                case 'd':
                    System.out.println("Hasil A - B:");
                    printMatrix(subtractMatrices(matrixA, matrixB));
                    break;
                case 'e':
                    System.out.println("Hasil A * B:");
                    printMatrix(multiplyMatrices(matrixA, matrixB));
                    break;
                case 'f':
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 'f');

        scanner.close();
    }

    public static void inputMatrix(Scanner sc, int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ");
                m[i][j] = sc.nextInt();
            }
        }
    }

    public static int[][] addMatrices(int[][] a, int[][] b) {
        int n = a.length;
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        return res;
    }

    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int n = a.length;
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = a[i][j] - b[i][j];
            }
        }
        return res;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int n = a.length;
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return res;
    }

    public static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}