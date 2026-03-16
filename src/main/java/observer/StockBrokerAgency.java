package observer;

public class StockBrokerAgency implements Observer {

    private String name;

    public StockBrokerAgency(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}