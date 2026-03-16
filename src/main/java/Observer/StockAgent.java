package Observer;

import java.util.ArrayList;
import java.util.List;

public class StockAgent implements Observable {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void stockMarketUp(double value) {
        notifyObservers("Stock market went UP to " + value);
    }

    public void stockMarketDown(double value) {
        notifyObservers("Stock market went DOWN to " + value);
    }
}