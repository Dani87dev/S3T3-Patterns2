package builder;


import builder.interfaces.IBeguda;
import builder.interfaces.IEntrant;
import builder.interfaces.IPostre;
import builder.interfaces.IPrincipal;
import builder.model.Menu;


public class MenuBuilder implements
        IEntrant, IPrincipal, IPostre, IBeguda {

    private Menu menu = new Menu();


    @Override
    public IEntrant withStarter(String starter) {
        menu.setStarter(starter);
        return this;
    }

    @Override
    public IPrincipal withMainCourse(String mainCourse){
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
    public IPostre withDessert(String dessert){
        menu.setDessert(dessert);
        return this;
    }


}