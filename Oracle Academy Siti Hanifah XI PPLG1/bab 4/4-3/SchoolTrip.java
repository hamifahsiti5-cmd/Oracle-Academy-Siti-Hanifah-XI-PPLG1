import java.util.Scanner;

public class SchoolTrip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah orang yang mendaftar: ");
        int totalPeople = in.nextInt();

        int buses = totalPeople / 45;
        int vanPassengers = totalPeople % 45;

        System.out.println("Jumlah bus yang diperlukan: " + buses);
        System.out.println("Total jumlah orang yang harus naik van: " + vanPassengers);
        in.close();
    }
}