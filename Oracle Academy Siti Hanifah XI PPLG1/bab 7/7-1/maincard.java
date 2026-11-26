// Main.java
import java.util.Scanner;
public class maincard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        card c1 = new card((int)(Math.random()*4+1), (int)(Math.random()*13+1));
        card c2 = new card((int)(Math.random()*4+1), (int)(Math.random()*13+1));
        int total = c1.points + c2.points;
        int count = 2;

        System.out.println("Card 1: " + c1 + "\nCard 2: " + c2 + "\nTotal Poin: " + total);

        while(total <= 21 && count < 5) {
            System.out.print("Ambil kartu lagi? (y/n): ");
            if(sc.next().equalsIgnoreCase("y")) {
                card next = new card((int)(Math.random()*4+1), (int)(Math.random()*13+1));
                count++; total += next.points;
                System.out.println("Kartu baru: " + next + " | Total Poin: " + total);
            } else { break; }
        }
        sc.close();
    }
}
