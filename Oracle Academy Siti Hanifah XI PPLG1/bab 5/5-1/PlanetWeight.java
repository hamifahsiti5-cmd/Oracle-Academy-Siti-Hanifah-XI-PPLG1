
import java.util.Scanner;

public class PlanetWeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat di Bumi (lbs): ");
        double berat = input.nextDouble();

        System.out.println("\nPilih planet:");
        System.out.println("1. Merkurius");
        System.out.println("2. Venus");
        System.out.println("3. Mars");
        System.out.println("4. Jupiter");
        System.out.println("5. Saturnus");
        System.out.println("6. Uranus");
        System.out.println("7. Neptunus");

        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();

        double faktor = 0;
        String planet = "";

        switch (pilihan) {
            case 1:
                faktor = 0.38;
                planet = "Merkurius";
                break;
            case 2:
                faktor = 0.91;
                planet = "Venus";
                break;
            case 3:
                faktor = 0.38;
                planet = "Mars";
                break;
            case 4:
                faktor = 2.36;
                planet = "Jupiter";
                break;
            case 5:
                faktor = 0.92;
                planet = "Saturnus";
                break;
            case 6:
                faktor = 0.89;
                planet = "Uranus";
                break;
            case 7:
                faktor = 1.13;
                planet = "Neptunus";
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                input.close();
                return;
        }

        double hasil = berat * faktor;

        System.out.println("Berat di " + planet + " adalah "
                + hasil + " lbs.");

        input.close();
    }
}

