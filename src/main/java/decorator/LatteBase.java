package decorator;

public class LatteBase implements BubbleTea {

    @Override
    public String getDescription() {
        return "Latte Bubble Tea";
    }

    @Override
    public double getCost() {
        return 3.50;
    }
}