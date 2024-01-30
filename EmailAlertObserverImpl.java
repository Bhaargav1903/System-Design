package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

	
	String emailId;
	StockObservable observable;
	public EmailAlertObserverImpl(String emailId,StockObservable observable) {
		this.observable=observable;
		this.emailId=emailId;
	}
	@Override
	public void update() {
			sendMail(emailId, "product is in Stock Hurry Up");
	}
	
	private void sendMail(String emailId,String msg) {
		System.out.println("Mail sent to: "+emailId);
	}
}
