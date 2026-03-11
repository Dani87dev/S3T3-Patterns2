package builder;

// La classe implementa TOTES les interfícies per poder "disfressar-se" de qualsevol pas
public class MenuBuilder implements IStarterStep, IMainCourseStep, IAfterMainStep, IDrinkStep, IMenuBuildStep {

    private Menu menu = new Menu(); // L'objecte que anem omplint

    // Inici del flux: podem triar entrant o anar al principal
    @Override
    public IMainCourseStep withStarter(String name) {
        this.menu.setStarter(name);
        return this; // Retornem el builder com a IMainCourseStep
    }

    @Override
    public IAfterMainStep withMainCourse(String name) {
        this.menu.setMainCourse(name);
        return this; // Saltem a l'habitació de postres/cafè/beguda
    }

    // Gestió de Postres o Cafè
    @Override
    public IDrinkStep withDessert(String name) {
        this.menu.setDessert(name);
        return this; // Ens porta a la beguda, ja no podem triar cafè
    }

    @Override
    public IDrinkStep withCoffee(String name) {
        this.menu.setCoffe(name);
        return this; // Ens porta a la beguda, ja no podem triar postres
    }

    // Pas de la beguda
    @Override
    public IMenuBuildStep withDrink(String drinkName) {
        this.menu.setDrink(drinkName);
        return this; // Ens porta al botó final de Build
    }

    // Mètode final
    @Override
    public Menu build() {
        return this.menu;
    }

}
