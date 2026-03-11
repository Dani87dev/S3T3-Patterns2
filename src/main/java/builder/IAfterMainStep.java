package builder;

public interface IAfterMainStep {
    // Si tries postres, et porta a la beguda (ja no pots triar cafè)
    IDrinkStep withDessert(String name);

    // Si tries cafè, et porta a la beguda (ja no pots triar postres)
    IDrinkStep withCoffee(String name);

    // Si no vols ni postres ni cafè, pots anar directe a la beguda
    IMenuBuildStep withDrink(String drinkName);
}