public class FactorialCalculator {
    public int num = 10; // Nilai global public

    // Perbaikan method getFactorial agar menghitung faktorial dengan benar
    public int getFactorial() {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Override method toString()
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factorial: ").append(num).append("! = ");
        
        for (int i = 1; i <= num; i++) {
            sb.append(i);
            if (i < num) {
                sb.append("*");
            }
        }
        
        sb.append(" = ").append(getFactorial());
        return sb.toString();
    }
}
