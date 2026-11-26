public class Vehicle {
    // Static variables (Soal 1.b)
    public static String MAKE = "Augur";
    public static int numVehicles = 0;

    // Instance variables (Soal 1.b)
    private String chassisNo;
    private String model;

    // Constructor (Soal 1.b)
    public Vehicle(String model) {
        numVehicles++; // Inkremen jumlah kendaraan
        this.chassisNo = "ch" + numVehicles; // Menggabungkan "ch" dengan nilai numVehicles
        this.model = model;
        System.out.println("Vehicle manufactured");
    }

    // Getter dan Setter untuk ChassisNo dan Model (Soal 1.b & 2.a)
    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter dan Setter untuk MAKE (Diperlukan untuk soal nomor 2)
    public static String getMake() {
        return MAKE;
    }

    public static void setMake(String make) {
        MAKE = make;
    }

    // Method toString() (Soal 1.k & 3.g)
    @Override
    public String toString() {
        return "The vehicle is manufactured by: " + MAKE + "\n" +
               "The model type is " + model + "\n" +
               "The chassis number is " + chassisNo + "\n" +
               "Engine Make: " + Engine.getMake() + "\n" +
               "Engine Capacity: " + Engine.getCapacity() + "cc";
    }

    // ==========================================
    // Soal Nomor 3 & 4: Static Nested Class Engine
    // ==========================================
    public static class Engine extends Vehicle {
        // Private static final variables (Soal 3.c & 3.d)
        private static final String MAKE = "Predicter";
        private static final int CAPACITY = 1600;

        // Constructor untuk Engine (Soal 4.b & 4.c)
        public Engine(String model) {
            super(model); // Mengirimkan variable model ke super constructor (Vehicle)
        }

        // Public static getter untuk Engine (Soal 3.f)
        public static String getMake() {
            return MAKE;
        }

        public static int getCapacity() {
            return CAPACITY;
        }
    }
}