package ObserverPattern.Observable;
import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObervableImpl implements StockObservable {
	//There maybe 5 objects observing iphone count so the 5 objects will be added here in this list
	public List<NotificationAlertObserver> oberverList=new ArrayList<>();
	
	//stock count
	public int stockCount=0;
	
	@Override
	//add observer
	public void add(NotificationAlertObserver oberver) {
		oberverList.add(oberver);
	}
	@Override
	//remove observer
	public void remove(NotificationAlertObserver observer) {
		oberverList.remove(observer);
	}
	
	@Override
	//notify the observer
	public void notifySubscribers() {
		for(NotificationAlertObserver observer: oberverList) {
			observer.update();
		}
	}
	
	//to set the stock count and send notification when stock out happens
	public void setStockCount(int newStockAdded) {
		if(stockCount==0) {
			notifySubscribers();
		}
		
		stockCount=stockCount+newStockAdded;
	}
	//returns the stock count
	public int getStockCount() {
		return stockCount;
	}
}
