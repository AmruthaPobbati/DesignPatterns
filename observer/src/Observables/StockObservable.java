package Observables;

import Observers.StockObserver;

public interface StockObservable {
    void setStockCount(int stockCount);

    void addObserver(StockObserver observer);
    void removeObserver(StockObserver observer);
    void removeAllObservers();
    void notifyObservers();
}
