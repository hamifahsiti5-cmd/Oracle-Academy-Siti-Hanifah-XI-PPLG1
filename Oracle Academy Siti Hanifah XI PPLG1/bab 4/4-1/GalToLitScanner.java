import java.util.Scanner;

public class GalToLitScanner {
    public static void main(String[] args) {
        // declare variables
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double liters = 0;

        // get input from user
        System.out.print("Enter the number of gallons: ");
        gallons = in.nextDouble();

        // add your calculation here
        liters = gallons * 3.785;

        // output the result to user
        System.out.println(gallons + " gallons equals " + liters + " liters");
        
        in.close();
    }
}