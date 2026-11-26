
import java.util.Scanner;

public class UjianAkhir {
    public static void main(String[] args) {
        double nilaiRataRata;
        int jumlahAbsen;
        boolean bebasUjian = false;

        Scanner masukan = new Scanner(System.in);

        System.out.println("Program menentukan pembebasan ujian akhir.");

        System.out.print("Masukkan nilai rata-rata: ");
        nilaiRataRata = masukan.nextDouble();

        System.out.print("Masukkan jumlah ketidakhadiran: ");
        jumlahAbsen = masukan.nextInt();

        if ((nilaiRataRata >= 90 && jumlahAbsen <= 3) ||
            (nilaiRataRata >= 80 && jumlahAbsen == 0)) {
            bebasUjian = true;
        }

        if (bebasUjian) {
            System.out.println("Selamat! Kamu bebas dari ujian akhir.");
        } else {
            System.out.println("Kamu tidak bebas dari ujian akhir.");
        }

        masukan.close();
    }
}
