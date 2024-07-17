package Observers;

import Observables.StockObservable;

public class EmailStockObserver implements StockObserver{
    String emailId;
    StockObservable stockObservable;

    public EmailStockObserver(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.printf("mail sent to: %s \n", emailId);
    }
}
