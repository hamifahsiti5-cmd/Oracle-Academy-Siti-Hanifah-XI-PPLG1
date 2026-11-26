public class Instrument {
    private boolean onSale;
    private double price;
    private int numInStock;

    public Instrument(double price, int numInStock) {
        this.price = price;
        this.numInStock = numInStock;
        this.onSale = false;
    }

    public double getPrice() {
        if (onSale) {
            return price * 0.85; // Diskon 15% jika onSale
        }
        return price;
    }

    public double applyEmployeeDiscount() {
        return getPrice() * 0.75; // Diskon karyawan 25% (75% dari harga)
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    public boolean getOnSale() {
        return onSale;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumInStock() {
        return numInStock;
    }

    public void setNumInStock(int numInStock) {
        this.numInStock = numInStock;
    }
}