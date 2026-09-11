import org.junit.jupiter.api.Test;

import java.util.Observer;

import static org.junit.jupiter.api.Assertions.*;

class StockAgentTest {

    @Test
    public void testStockAgentNotifications() {
        StockAgent agent = new StockAgent();

        Observer alphaBrokers = new StockBrokerAgency("Alpha Brokers");
        Observer zenithInvestmenrs = new StockBrokerAgency("Zenith Investments");

        agent.addObserver(alphaBrokers);
        agent.addObserver(zenithInvestmenrs);

        agent.stockMarketUp(150.75);
        agent.stockMarketDown(145.5);
    }
}