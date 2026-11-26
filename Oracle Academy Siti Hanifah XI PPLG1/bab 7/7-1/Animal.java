public class Animal {
    int weight, height; // Instance variables (*)
    double speed;       // Instance variable (*)

    public Animal() {   // Constructor [1]
        weight = 50; height = 4; speed = 2;
    }

    public Animal(int w, int h, int s) { // Constructor [2] (< w, h, s >)
        weight = w; height = h; speed = s;
    }

    public double getTime(double miles) { // Method signature (getTime) | Return: double
        return miles / speed;
    }

    public int getWeight() { return weight; } // Return: int
    public int getHeight() { return height; } // Return: int
    public double getSpeed() { return speed; } // Return: double
}
