public class StudentDriver {
    public static void main(String[] args) {
        Student s1 = new Student("Mary Jones", 14, 46);
        Student s2 = new Student("John Stiner", 60, 173);
        Student s3 = new Student("Ari Samala", 31, 69);

        s3.addCreditsAndPoints(13, 52);
        System.out.println("IP Ari Samala setelah update: " + s3.getGpa());
    }
}
