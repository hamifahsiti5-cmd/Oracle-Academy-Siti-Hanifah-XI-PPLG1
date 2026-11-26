public class Shape {
    private int numSides;
    private boolean getregular;

    public Shape() {
        this.numSides = 3;
        this.getregular = true;
    }

    public Shape(int numSides, boolean regular) {
        this.numSides = numSides;
        this.getregular = regular;
    }

    public int getNumSides() { return numSides; }
    public void setNumSides(int numSides) { this.numSides = numSides; }
    public boolean isRegular() { return getregular; }
    public void setRegular(boolean getregular) { this.getregular = getregular; }
}