package builder;

public class Menu {

    private String starter, mainCourse, dessert, coffe, drink, supplement;
    private boolean vegan, glutenFree;

    private Menu() {
    }

    public String getStarter() {
        return starter;
    }

    public String getMainCourse() {
        return mainCourse;
    }

    public String getDessert() {
        return dessert;
    }

    public String getCoffe() {
        return coffe;
    }

    public String getDrink() {
        return drink;
    }

    public boolean isVegan() {
        return vegan;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public String getSupplement() {
        return supplement;
    }

    @Override
    public String toString() {
        return "Menu:\n" +
                " - Starter: " + (this.getStarter() != null ?   this.getStarter()  : " no starter ordered") + "\n" +
                " - Main Course: " + this.getMainCourse() + "\n" +
                " - Dessert: " + (this.getDessert() != null ?  this.getDessert() : " no dessert ordered") + "\n" +
                " - Drink: " + (this.getDrink() != null ?  this.getDrink() : " no drink ordered") + "\n";
    }
}
