package builder;


import builder.interfaces.IDrink;
import builder.interfaces.IStarter;
import builder.interfaces.IDessert;
import builder.interfaces.IMainCourse;
import builder.model.Menu;


public class MenuBuilder implements
        IStarter, IMainCourse, IDessert, IDrink {

    private Menu menu = new Menu();


    @Override
    public IStarter withStarter(String starter) {
        menu.setStarter(starter);
        return this;
    }

    @Override
    public IMainCourse withMainCourse(String mainCourse){
        menu.setMainCourse(mainCourse);
        return this;
    }

    @Override
    public MenuBuilder isVegan(){
        menu.setVegan(true);
        return this;
    }

    @Override
    public  MenuBuilder isGlutenFree(){
        menu.setGlutenFree(true);
        return this;
    }

    @Override
    public MenuBuilder withSupplement(String supplement){
        menu.setSupplement(supplement);
        return this;
    }

    @Override
    public IDessert withDessert(String dessert){
        menu.setDessert(dessert);
        return this;
    }

    @Override
    public IDessert withCoffee(String coffee){
        menu.setCoffee(coffee);
        return this;
    }

    @Override
    public IDrink withDrink(String drink){
        menu.setDrink(drink);
        return this;
    }

    @Override
    public Menu build(){
        return menu;
    }


}