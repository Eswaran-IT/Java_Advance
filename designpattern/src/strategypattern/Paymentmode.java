package strategypattern;

public interface Paymentmode {
	void pay(int amount);
}

class creditpay implements Paymentmode{
	public void pay(int amount) {
		System.out.println(amount+" by creditpay");
	}
}
class debitpay implements Paymentmode{
	public void pay(int amount) {
		System.out.println(amount+" by debitpay");
	}
}
class gpay implements Paymentmode{
	public void pay(int amount) {
		System.out.println(amount+" by gpay");
	}
}