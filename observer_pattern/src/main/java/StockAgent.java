import java.util.Observable;

public class StockAgent extends Observable {

    private double stockMarketValue;

    public double getStockMarketValue() {
        return stockMarketValue;
    }

    public void stockMarketUp(double stockValue) {
        this.stockMarketValue = stockValue;
        setChanged();
        notifyObservers(String.format("Stock market went UP to %.2f", this.stockMarketValue));
    }

    public void stockMarketDown(double stockValue) {
        this.stockMarketValue = stockValue;
        setChanged();
        notifyObservers(String.format("Stock market went DOWN to %.2f", this.stockMarketValue));
    }
}
