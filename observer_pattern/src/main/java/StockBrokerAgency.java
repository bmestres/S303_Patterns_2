import java.util.Observable;
import java.util.Observer;

public class StockBrokerAgency implements Observer {

    private final String name;

    public StockBrokerAgency(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable agent, Object notification) {
        System.out.format("%s received notification: %s\n",
                this.name, notification);
    }
}
