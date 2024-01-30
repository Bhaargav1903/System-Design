package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;
public class MobileAlertObserverImpl implements NotificationAlertObserver{

	
	String userName;
	StockObservable observable;
	
	public MobileAlertObserverImpl(String userName,StockObservable observable) {
		this.observable=observable;
		this.userName=userName;
	}
	@Override
	public void update() {
		sendMail(userName, "product is in Stock Hurry Up");
	}
	
	private void sendMail(String userName,String msg) {
		System.out.println("Mail sent to: "+userName);
	}
}
