package decorator;

public class Ice extends BubbleTeaDecorator {

    public Ice(BubbleTea bubbleTea) {
        super(bubbleTea);
    }

    @Override
    public String getDescription() {
        return bubbleTea.getDescription() + " + Ice";
    }

    @Override
    public double getCost() {
        return bubbleTea.getCost() + 0.25;
    }
}