package builder.steps;

import builder.model.Menu;

public interface IMenuBuildStep {
    IMenuBuildStep withDrink(String drinkName); // Permite añadir bebida tras postre/café
    Menu build();
}