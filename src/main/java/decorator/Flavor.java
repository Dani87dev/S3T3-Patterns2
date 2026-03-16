package decorator;

public class Flavor extends BubbleTeaDecorator {

    private String flavorName;

    public Flavor(BubbleTea bubbleTea, String flavorName) {
        super(bubbleTea);
        this.flavorName = flavorName;
    }

    @Override
    public String getDescription() {
        return bubbleTea.getDescription() + " + Flavor: " + flavorName;
    }

    @Override
    public double getCost() {
        return bubbleTea.getCost() + 0.60;
    }
}