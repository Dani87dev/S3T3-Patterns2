package builder;

public interface IMenuBuildStep {
    IMenuBuildStep withDrink(String drinkName); // Permite añadir bebida tras postre/café
    Menu build();
}