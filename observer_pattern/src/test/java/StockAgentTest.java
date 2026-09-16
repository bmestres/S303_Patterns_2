import org.junit.jupiter.api.Test;

import java.util.Observer;

import static org.junit.jupiter.api.Assertions.*;

class StockAgentTest {

    @Test
    public void testStockAgentNotifications() {

        StockAgent agent = new StockAgent();

        Agency alphaBrokers = new StockBrokerAgency("Alpha Brokers");
        Agency zenithInvestments = new StockBrokerAgency("Zenith Investments");

        agent.addObserver(alphaBrokers);
        agent.addObserver(zenithInvestments);

        String alphaBrokersExpectedUpMessage = "Alpha Brokers received notification: Stock market went UP to 150,75";
        String zenitInvestmentsExpectedUPMessage = "Zenith Investments received notification: Stock market went UP to 150,75";
        agent.stockMarketUp(150.75);

        assertEquals(alphaBrokersExpectedUpMessage, alphaBrokers.getLatestMessage());
        assertEquals(zenitInvestmentsExpectedUPMessage, zenithInvestments.getLatestMessage());

        String alphaBrokersExpectedDOWNMessage = "Alpha Brokers received notification: Stock market went DOWN to 145,50";
        String zenitInvestmentsExpectedDOWNMessage = "Zenith Investments received notification: Stock market went DOWN to 145,50";
        agent.stockMarketDown(145.5);

        assertEquals(alphaBrokersExpectedDOWNMessage, alphaBrokers.getLatestMessage());
        assertEquals(zenitInvestmentsExpectedDOWNMessage, zenithInvestments.getLatestMessage());
    }
}