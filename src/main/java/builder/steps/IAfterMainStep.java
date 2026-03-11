package builder.steps;

public interface IAfterMainStep extends IMenuBuildStep {
    IMenuBuildStep withDessert(String name);
    IMenuBuildStep withCoffee(String name);
    IMenuBuildStep withDrink(String drinkName);
}