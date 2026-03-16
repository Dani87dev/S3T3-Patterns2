package builder.interfaces;

public interface IMainCourse {

    IMainCourse isVegan();
    IMainCourse isGlutenFree();
    IMainCourse withSupplement(String supplement);
    IDessert withDessert(String dessert);
    IDessert withCoffee(String coffee);
    IDrink withDrink(String drink);

}
