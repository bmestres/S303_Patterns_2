import java.util.ArrayList;
import java.util.List;

public class StockAgent {

    private double stockMarketValue;
    private final List<Agency> agencies = new ArrayList<>();


    public void addObserver(Agency agency) {
        this.agencies.add(agency);
    }

    public void removeObserver(StockBrokerAgency agency) {
        this.agencies.remove(agency);
    }


    public void stockMarketUp(double stockValue) {
        this.stockMarketValue = stockValue;

        String defaultUpNotification = String.format("Stock market went UP to %.2f", this.stockMarketValue);

        for (Agency agency : this.agencies) {
            agency.update(defaultUpNotification);
        }
    }

    public void stockMarketDown(double stockValue) {
        this.stockMarketValue = stockValue;
        String defaultDownNotification = String.format("Stock market went DOWN to %.2f", this.stockMarketValue);

        for (Agency agency : this.agencies) {
            agency.update(defaultDownNotification);
        }
    }
}
