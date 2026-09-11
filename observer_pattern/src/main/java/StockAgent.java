import java.util.Observable;

public class StockAgent extends Observable {

    private double stockMarketValue;


    public StockAgent() {

    }

    public void addObserver() {

    }

    public void removeObserver() {

    }

    public void stockMarketUp(double stockValue) {
        this.stockMarketValue = stockValue;
        setChanged();
        notifyObservers(stockValue);

    }

    public void stockMarketDown(double stockValue) {
        this.stockMarketValue = stockValue;
        setChanged();
        notifyObservers(stockValue);

    }
}
