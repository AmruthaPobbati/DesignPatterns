import Observables.IPhoneStockObservable;
import Observables.StockObservable;
import Observers.EmailStockObserver;
import Observers.MobileTextStockObserver;
import Observers.StockObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable stockObservable = new IPhoneStockObservable();

        StockObserver observer1 = new EmailStockObserver("xyz@gmail.com", stockObservable);
        StockObserver observer2 = new EmailStockObserver("abc@gmail.com", stockObservable);
        StockObserver observer3 = new MobileTextStockObserver("9959862572", stockObservable);

        stockObservable.addObserver(observer1);
        stockObservable.addObserver(observer2);
        stockObservable.addObserver(observer3);

        stockObservable.setStockCount(10);
        stockObservable.setStockCount(0);
        stockObservable.setStockCount(100);

    }
}