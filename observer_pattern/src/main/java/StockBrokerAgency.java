import java.util.Observable;
import java.util.Observer;

public class StockBrokerAgency implements Observer {

    private final String name;
    private String latestMessage;

    public StockBrokerAgency(String name) {
        this.name = name;
        this.latestMessage = "";
    }

    public String getName() {
        return this.name;
    }

    public String getLatestMessage() {
        return this.latestMessage;
    }

    @Override
    public void update(Observable agent, Object notification) {
        this.latestMessage = String.format("%s received notification: %s",
                this.name, notification);

        System.out.println(this.latestMessage);
    }
}
