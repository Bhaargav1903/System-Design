package ObserverPattern;

import ObserverPattern.Observable.IphoneObervableImpl;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;
public class Store {

	public static void main(String[] args) {
		StockObservable iphoneStockObservable=new IphoneObervableImpl();
		NotificationAlertObserver observer1= new EmailAlertObserverImpl("Test@email.com",iphoneStockObservable);
		NotificationAlertObserver observer2 = new EmailAlertObserverImpl("test@gmail.com",iphoneStockObservable);
		NotificationAlertObserver observer3 = new MobileAlertObserverImpl("Bhaargav", iphoneStockObservable);
		
		
		iphoneStockObservable.add(observer1);
		iphoneStockObservable.add(observer2);
		iphoneStockObservable.add(observer3);
		
		iphoneStockObservable.setStockCount(10);
		iphoneStockObservable.setStockCount(-10);
		System.out.println("Second time message is sent because it was out of stock when we added -10");
		iphoneStockObservable.setStockCount(100);
	}
}
