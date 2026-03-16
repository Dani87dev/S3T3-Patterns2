package builder.interfaces;

import builder.model.Menu;

public interface IDessert {

    IDrink withDrink(String beguda);
    Menu build();

}
