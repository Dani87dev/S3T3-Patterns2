package builder;

public class Menu {

    private String starter, mainCourse, dessert, coffe, drink, supplement;
    private boolean vegan, glutenFree;

    public Menu() {
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

    public void setStarter(String starter) {
        this.starter = starter;
    }

    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public void setCoffee(String coffe) {
        this.coffe = coffe;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setSupplement(String supplement) {
        this.supplement = supplement;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
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
