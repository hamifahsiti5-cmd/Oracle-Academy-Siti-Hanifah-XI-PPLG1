public class Main {
    public static void main(String[] args) {

        Shape shape1 = new Shape(3, true);
        Shape shape2 = new Shape(4, false);

        System.out.println("Shape 1:");
        System.out.println("Number of sides: " + shape1.getNumSides());
        System.out.println("Regular: " + shape1.isRegular());

        System.out.println("\nShape 2:");
        System.out.println("Number of sides: " + shape2.getNumSides());
        System.out.println("Regular: " + shape2.isRegular());
    }
}