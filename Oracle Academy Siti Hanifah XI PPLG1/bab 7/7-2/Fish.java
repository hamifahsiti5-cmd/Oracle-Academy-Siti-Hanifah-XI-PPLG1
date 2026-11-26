public class Fish {
    private String name;
    private String typeOfFish;
    private int friendliness;

    // Constructor tanpa argumen (Default)
    public Fish() {
        this.typeOfFish = "Unknown";
        this.friendliness = 3;
    }

    // Constructor dengan argumen (Overloading Constructor)
    public Fish(String name, String t, int f) {
        this.name = name;
        this.typeOfFish = t;
        this.friendliness = f;
    }

    // Method getFriendliness() untuk mengembalikan tingkat keramahan
    public int getFriendliness() {
        return friendliness;
    }

    public String getName() {
        return name;
    }

    public String getTypeOfFish() {
        return typeOfFish;
    }
}