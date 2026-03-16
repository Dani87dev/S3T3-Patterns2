package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BubbleTeaTest {

    @Test
    public void testLatteWithTapiocaSugarAndFlavors() {
        BubbleTea tea = new LatteBase();
        tea = new Tapioca(tea);
        tea = new Sugar(tea);
        tea = new Flavor(tea, "Maduixa");
        tea = new Flavor(tea, "Mango");

        assertEquals("Latte Bubble Tea + Tapioca + Sugar + Flavor: Maduixa + Flavor: Mango",
                tea.getDescription());
        assertEquals(5.50, tea.getCost());
    }

    @Test
    public void testMatchaWithIce() {
        BubbleTea tea = new MatchaBase();
        tea = new Ice(tea);

        assertEquals("Matcha Bubble Tea + Ice", tea.getDescription());
        assertEquals(3.45, tea.getCost());
    }

    @Test
    public void testTeaWithNoDecorators() {
        BubbleTea tea = new TeaBase();

        assertEquals("Tea Bubble Tea", tea.getDescription());
        assertEquals(3.00, tea.getCost());
    }
}