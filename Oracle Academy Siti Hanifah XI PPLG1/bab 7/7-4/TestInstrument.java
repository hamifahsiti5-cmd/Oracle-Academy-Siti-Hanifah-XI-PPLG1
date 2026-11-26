public class TestInstrument {
    public static void main(String[] args) {
        // Membuat object Guitar (harga awal 1000, stok 5, 6 senar, elektrik = true)
        Guitar myGuitar = new Guitar(1000.0, 5, 6, true);

        System.out.println("Harga normal: " + myGuitar.getPrice());

        // Mengatur status onSale menjadi true
        myGuitar.setOnSale(true);
        System.out.println("Harga setelah diskon toko (onSale): " + myGuitar.getPrice());

        // Menerapkan diskon karyawan
        System.out.println("Harga setelah diskon karyawan: " + myGuitar.applyEmployeeDiscount());
    }
}
