import java.util.Observable;
import java.util.Observer;

public class StockBrokerAgency implements Observer {

    private final String name;
    private double marketValue;
    private StockMarketChange stockMarketChange;

    public StockBrokerAgency(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable agent, Object stockValue) {
        this.setMarketValue((double)stockValue);

    }

    public String notifyChange(){
        return
                String.format("%s received notification: Stock market went %s to %.2f",
                this.name, this.stockMarketChange, this.marketValue);
    }

    private void setMarketValue(double value) {
        /* if up, will add to this.marketValue and if down, will subtract to
        this.marketValue
         */
    }
}
