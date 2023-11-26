package strategypattern;
/*
 * Context is the intermediate 
 * interface with implementing classes
 * using context class the required object are created
 * */
public class Main {
public static void main(String[] args) {
	System.out.println("Strategy pattern");
	Payment p=new Payment();
	p.setMode(new gpay());
	p.performPayment(550);
}
}

class Payment {
    // Interface object
    Paymentmode payer;
/*
 * Reason to use this pattern are 
 * we cannot say that all methods 
 * are used in implemented class and some
 * may used or not->this pattern 
 * helps to choose the required one only/
 */
    public void setMode(Paymentmode p) {
        this.payer = p;
    }

    public void performPayment(int amount) {
        payer.pay(amount);
    }
}
