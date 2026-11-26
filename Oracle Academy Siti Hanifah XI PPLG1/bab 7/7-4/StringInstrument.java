public class StringInstrument extends Instrument {
    private int numStrings;

    public StringInstrument(double price, int numInStock, int numStrings) {
        super(price, numInStock);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }
}
