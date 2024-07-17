package Observers;

import Observables.StockObservable;

public class MobileTextStockObserver implements StockObserver {

    String mobileNumber;
    StockObservable stockObservable;

    public MobileTextStockObserver(String mobileNumber, StockObservable stockObservable) {
        this.mobileNumber = mobileNumber;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.printf("text msg sent to: %s \n", mobileNumber);
    }
}
