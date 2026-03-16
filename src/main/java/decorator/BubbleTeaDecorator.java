package decorator;

public abstract class BubbleTeaDecorator implements BubbleTea {

    protected BubbleTea bubbleTea;

    public BubbleTeaDecorator(BubbleTea bubbleTea) {
        this.bubbleTea = bubbleTea;
    }

    @Override
    public String getDescription() {
        return bubbleTea.getDescription();
    }

    @Override
    public double getCost() {
        return bubbleTea.getCost();
    }
}