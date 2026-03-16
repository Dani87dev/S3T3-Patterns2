package Observer;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StockAgentTest {

    @Test
    public void testStockAgentNotifications() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        StockAgent agent = new StockAgent();

        Observer itAcademy = new StockBrokerAgency("It Academy");
        Observer EstrellaDamm = new StockBrokerAgency("Estrella Damm");

        agent.addObserver(itAcademy);
        agent.addObserver(EstrellaDamm);

        agent.stockMarketUp(150.75);
        agent.stockMarketDown(145.50);

        String output = outContent.toString();

        assertTrue(output.contains("It Academy received notification: Stock market went UP to 150.75"));
        assertTrue(output.contains("Estrella Damm received notification: Stock market went UP to 150.75"));

        assertTrue(output.contains("It Academy received notification: Stock market went DOWN to 145.50"));
        assertTrue(output.contains("Estrella Damm received notification: Stock market went DOWN to 145.50"));
    }

    @Test
    public void testRemoveObserver() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        StockAgent agent = new StockAgent();
        Observer itAcademy = new StockBrokerAgency("It Academy");

        agent.addObserver(itAcademy);
        agent.removeObserver(itAcademy);

        agent.stockMarketUp(200.00);

        String output = outContent.toString();
        assertTrue(output.isEmpty());
    }
}
