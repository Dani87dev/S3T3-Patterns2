package decorator;

public class Tapioca extends BubbleTeaDecorator {

    public Tapioca(BubbleTea bubbleTea) {
        super(bubbleTea);
    }

    @Override
    public String getDescription() {
        return bubbleTea.getDescription() + " + Tapioca";
    }

    @Override
    public double getCost() {
        return bubbleTea.getCost() + 0.50;
    }
}