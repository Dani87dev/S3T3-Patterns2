package builder;

import builder.model.Menu;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MenuBuilderTest {

    @Test
    void testExecutiveMenu() {
        Menu menu = new MenuBuilder()
                .withStarter("Amanida Mediterrània")
                .isVegan()
                .isGlutenFree()
                .withMainCourse("Filet de Vedella")
                .withSupplement("Guarnició extra")
                .withDessert("Mousse de xocolata")
                .withDrink("Vi Negre")
                .build();

        assertEquals("Amanida Mediterrània", menu.getStarter());
        assertEquals("Filet de Vedella", menu.getMainCourse());
        assertEquals("Mousse de xocolata", menu.getDessert());
        assertEquals("Vi Negre", menu.getDrink());
        assertTrue(menu.isVegan());
        assertTrue(menu.isGlutenFree());
    }

    @Test
    void testKidsMenu() {
        Menu menu = new MenuBuilder()
                .withMainCourse("Macarrons amb tomàquet")
                .withDessert("Gelat de Vainilla")
                .withDrink("Suc de taronja")
                .build();

        assertNull(menu.getStarter());
        assertEquals("Macarrons amb tomàquet", menu.getMainCourse());
        assertEquals("Gelat de Vainilla", menu.getDessert());
        assertEquals("Suc de taronja", menu.getDrink());
    }

    
}