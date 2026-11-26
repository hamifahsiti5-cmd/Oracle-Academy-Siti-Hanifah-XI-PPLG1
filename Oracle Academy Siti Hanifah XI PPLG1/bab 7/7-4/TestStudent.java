import java.util.Date;

public class TestStudent {
    public static void main(String[] args) {
        // Membuat object Student
        Student student1 = new Student("Budi", "Santoso", "Pratama", new Date(), 
                                       "12345678", "Ilmu Komputer", "Sarjana", 2027);

        System.out.println("Nama Mahasiswa: " + student1.getName());
        System.out.println("NIM: " + student1.getNim());
        System.out.println("Jurusan Awal: " + student1.getMajor());

        // Mengubah jurusan menggunakan method changeMajor
        student1.changeMajor("Matematika");
        System.out.println("Jurusan Baru: " + student1.getMajor());

        // Menghitung GPA berdasarkan array nilai
        String[] nilaiUjian = {"A", "B+", "A-", "B"};
        student1.calculateGPA(nilaiUjian);
        System.out.println("IP (GPA) Mahasiswa: " + student1.getGpa());
    }
}