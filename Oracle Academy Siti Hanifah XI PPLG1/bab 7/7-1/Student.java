public class Student {
    private String name;
    private int credits;
    private double gpa;
    private double qualityPoints;

    public Student(String name, int credits, double qualityPoints) {
        this.name = name;
        this.credits = credits;
        this.qualityPoints = qualityPoints;
        this.gpa = calculateGPA();
    }

    public double calculateGPA() {
        if (credits == 0) return 0.0;
        return qualityPoints / credits;
    }

    public void addCreditsAndPoints(int newCredits, double newQualityPoints) {
        this.credits += newCredits;
        this.qualityPoints += newQualityPoints;
        this.gpa = calculateGPA();
    }

    public String getName() { return name; }
    public int getCredits() { return credits; }
    public double getQualityPoints() { return qualityPoints; }
    public double getGpa() { return gpa; }
} 
