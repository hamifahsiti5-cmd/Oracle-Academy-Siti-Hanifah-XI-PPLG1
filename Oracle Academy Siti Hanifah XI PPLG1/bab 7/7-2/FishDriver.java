public class FishDriver {

    // Nomor 7: nicestFish dengan 2 parameter Fish
    public static Fish nicestFish(Fish f1, Fish f2) {
        if (f1.getFriendliness() >= f2.getFriendliness()) {
            return f1;
        }
        return f2;
    }

    // Nomor 8: nicestFish dengan varargs (jumlah ikan bervariasi)
    public static Fish nicestFish(Fish... fishes) {
        if (fishes.length == 0) {
            return null;
        }
        Fish temp = fishes[0];
        for (int i = 1; i < fishes.length; i++) {
            if (fishes[i].getFriendliness() > temp.getFriendliness()) {
                temp = fishes[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        // Nomor 6: Inisialisasi 2 ikan baru
        Fish fish1 = new Fish("Amber", "AngelFish", 5);
        Fish fish2 = new Fish("James", "Guppy", 3);

        // Menguji method nicestFish
        Fish best = nicestFish(fish1, fish2);
        
        System.out.println("=== PENGUJIAN IKAN TERRAMAH == /n");
        System.out.println("Ikan 1: " + fish1.getName() + " (Keramahan: " + fish1.getFriendliness() + ")");
        System.out.println("Ikan 2: " + fish2.getName() + " (Keramahan: " + fish2.getFriendliness() + ")");
        System.out.println("\nIkan paling ramah yang dikembalikan: " + best.getName() + " (" + best.getTypeOfFish() + ")");
    }
}