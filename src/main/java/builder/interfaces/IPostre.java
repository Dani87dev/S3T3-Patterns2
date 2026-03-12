package builder.interfaces;

import builder.model.Menu;

public interface IPostre {

    IBeguda withDrink(String beguda);
    Menu build();

}
