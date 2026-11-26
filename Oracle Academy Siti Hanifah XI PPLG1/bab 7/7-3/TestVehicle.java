class TestVehicle {
    public static void main(String[] args) {
        // Menggunakan static variable MAKE dan numVehicles (Soal 1.c)
        System.out.println("Manufacturer: " + Vehicle.MAKE);
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);

        // Membuat object vehicle1 dengan parameter "Vision" (Soal 1.f & output referensi)
        Vehicle vehicle1 = new Vehicle("Vision");

        // Menampilkan informasi instance variable menggunakan dot notation (Soal 1.g, 1.i)
        System.out.println("The vehicle is manufactured by: " + Vehicle.MAKE);
        System.out.println("The model type is " + vehicle1.getModel());
        System.out.println("The chassis number is " + vehicle1.getChassisNo());

        // Membuat vehicle kedua dengan parameter "Edict" (Soal 1.j)
        Vehicle vehicle2 = new Vehicle("Edict");
        System.out.println("The vehicle is manufactured by: " + Vehicle.MAKE);
        System.out.println("The model type is " + vehicle2.getModel());
        System.out.println("The chassis number is " + vehicle2.getChassisNo());

        // Mengubah nilai MAKE menggunakan vehicle2 (Soal 2.a)
        vehicle2.setMake("Seer");

        // Menampilkan nilai vehicle1 dan vehicle2 setelah MAKE diubah (Soal 2.b)
        System.out.println("\n--- Status setelah vehicle2 mengubah Make ---");
        System.out.println(vehicle1.toString());
        System.out.println();
        System.out.println(vehicle2.toString());
        System.out.println();

        // Membuat object Engine (vehicle3) menggunakan inner static class (Soal 4.d)
        Vehicle.Engine vehicle3 = new Vehicle.Engine("Fortune");

        // Menampilkan informasi detail dari vehicle3 (Soal 4.e)
        System.out.println("Vehicle number " + vehicle3.getChassisNo() + 
                           " is a " + vehicle3.getModel() + 
                           " model and has an engine capacity of " + Vehicle.Engine.getCapacity() + "cc");

        // Menampilkan total jumlah mobil yang diproduksi (Soal 1.m)
        // Catatan: Total dihitung dari vehicle1, vehicle2, dan vehicle3 (yang mewarisi Vehicle)
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
    }
}