import org.junit.jupiter.api.Test;

import java.util.Observer;

import static org.junit.jupiter.api.Assertions.*;

class StockAgentTest {

    @Test
    public void testStockAgentNotifications() {
        StockAgent agent = new StockAgent();

        Observer alphaBrokers = new StockBrokerAgency("Alpha Brokers");
        Observer zenithInvestments = new StockBrokerAgency("Zenith Investments");

        agent.addObserver(alphaBrokers);
        agent.addObserver(zenithInvestments);

        String alphaBrokersExpectedUpMessage = "Alpha Brokers received notification: Stock market went UP to 150,75";
        String zenitInvestmentsExpectedUPMessage = "Zenith Investments received notification: Stock market went UP to 150,75";
        agent.stockMarketUp(150.75);

        assertEquals(alphaBrokersExpectedUpMessage, ((StockBrokerAgency)alphaBrokers).getLatestMessage());
        assertEquals(zenitInvestmentsExpectedUPMessage, ((StockBrokerAgency)zenithInvestments).getLatestMessage());

        String alphaBrokersExpectedDOWNMessage = "Alpha Brokers received notification: Stock market went DOWN to 145,50";
        String zenitInvestmentsExpectedDOWNMessage = "Zenith Investments received notification: Stock market went DOWN to 145,50";
        agent.stockMarketDown(145.5);

        assertEquals(alphaBrokersExpectedDOWNMessage, ((StockBrokerAgency)alphaBrokers).getLatestMessage());
        assertEquals(zenitInvestmentsExpectedDOWNMessage, ((StockBrokerAgency)zenithInvestments).getLatestMessage());


    }
}