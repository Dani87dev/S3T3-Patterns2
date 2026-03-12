package builder.interfaces;

public interface IPrincipal {

    IPrincipal isVegan();
    IPrincipal isGlutenFree();
    IPrincipal withSupplement(String supplement);
    IPostre withDessert(String dessert);
    IPostre withCoffee(String coffee);
    IPostre withDrink(String drink);

}
