package Observables;

import Observers.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneStockObservable implements StockObservable {
    List<StockObserver> observers = new ArrayList<>();

    private int stockCount = 0;

    public int getStockCount() {
        return stockCount;
    }

    @Override
    public void setStockCount(int stockCount) {
        if (stockCount == 0) {
            notifyObservers();
        }
        this.stockCount = stockCount;
    }

    @Override
    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void removeAllObservers() {
        observers.clear();
    }

    @Override
    public void notifyObservers() {
        for (StockObserver observer: observers) {
            observer.update();
        }
    }
}
