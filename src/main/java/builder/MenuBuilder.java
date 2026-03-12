package builder;

import builder.config.IMainCourseConfig;
import builder.config.IStarterConfig;
import builder.model.Menu;
import builder.steps.IAfterMainStep;
import builder.steps.IMainCourseStep;
import builder.steps.IMenuBuildStep;
import builder.steps.IStarterStep;

public class MenuBuilder implements
        IStarterStep, IStarterConfig, IMainCourseStep,
        IMainCourseConfig, IAfterMainStep, IMenuBuildStep {

    private Menu menu = new Menu();

    @Override
    public IStarterConfig withStarter(String name) {
        this.menu.setStarter(name);
        return this;
    }

    @Override
    public IMainCourseConfig withMainCourse(String name) {
        this.menu.setMainCourse(name);
        return this;
    }

    @Override
    public MenuBuilder isVegan() {
        this.menu.setVegan(true);
        return this;
    }

    @Override
    public MenuBuilder isGlutenFree() {
        this.menu.setGlutenFree(true);
        return this;
    }

    @Override
    public MenuBuilder withSupplement(String supplement) {
        this.menu.setSupplement(supplement);
        return this;
    }

    @Override
    public MenuBuilder withDessert(String name) {
        this.menu.setDessert(name);
        return this;
    }

    @Override
    public MenuBuilder withCoffee(String name) {
        this.menu.setCoffee(name);
        return this;
    }

    @Override
    public MenuBuilder withDrink(String drinkName) {
        this.menu.setDrink(drinkName);
        return this;
    }

    @Override
    public Menu build() {
        return this.menu;
    }
}