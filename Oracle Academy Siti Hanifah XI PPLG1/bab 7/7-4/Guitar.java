public class Guitar extends StringInstrument {
    private boolean isElectric;

    public Guitar(double price, int numInStock, int numStrings, boolean isElectric) {
        super(price, numInStock, numStrings);
        this.isElectric = isElectric;
    }

    public boolean getIsElectric() {
        return isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }
}
