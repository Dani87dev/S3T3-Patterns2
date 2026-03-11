package builder.steps;

import builder.model.Menu;

public interface IMenuBuildStep {
    IMenuBuildStep withDrink(String drinkName);
    Menu build();
}