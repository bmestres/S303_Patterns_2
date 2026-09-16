import org.junit.jupiter.api.Test;

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

        assertEquals(alphaBrokersExpectedUpMessage, ((StockBrokerAgency)alphaBrokers).getLatestMessage());
        assertEquals(zenitInvestmentsExpectedUPMessage, ((StockBrokerAgency)zenithInvestments).getLatestMessage());

        String alphaBrokersExpectedDOWNMessage = "Alpha Brokers received notification: Stock market went DOWN to 145,50";
        String zenitInvestmentsExpectedDOWNMessage = "Zenith Investments received notification: Stock market went DOWN to 145,50";
        agent.stockMarketDown(145.5);

        assertEquals(alphaBrokersExpectedDOWNMessage, ((StockBrokerAgency)alphaBrokers).getLatestMessage());
        assertEquals(zenitInvestmentsExpectedDOWNMessage, ((StockBrokerAgency)zenithInvestments).getLatestMessage());
    }

    @Test
    void stockMarketChangeShouldNotifyAgencies() {
        StockAgent agent = new StockAgent();

        MockAgency alphaBrokers = new MockAgency();
        MockAgency zenithInvestments = new MockAgency();

        agent.addObserver(alphaBrokers);
        agent.addObserver(zenithInvestments);

        agent.stockMarketUp(25.67);

        String expectedMessageUp = String.format("Stock market went UP to %.2f", 25.67);

        alphaBrokers.expect(expectedMessageUp);
        zenithInvestments.expect(expectedMessageUp);

        alphaBrokers.verify();
        zenithInvestments.verify();

        agent.stockMarketDown(39.57);

        String expectedMessageDown = String.format("Stock market went DOWN to %.2f", 25.67);

        alphaBrokers.expect(expectedMessageDown);
        zenithInvestments.expect(expectedMessageDown);
    }
}