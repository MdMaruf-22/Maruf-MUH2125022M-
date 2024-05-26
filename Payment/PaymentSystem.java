package Payment;

public class PaymentSystem {
    private PaymentMethod paymentMethod;
    public void setPaymentMethod(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }
    public boolean makePayment(double amount){
        return paymentMethod.pay(amount);
    }
    public static void main(String[] args) {
        PaymentSystem paymentSystem = new PaymentSystem();
        paymentSystem.setPaymentMethod(new CreditCardPayment());
        paymentSystem.makePayment(1000);

        paymentSystem.setPaymentMethod(new BkashPayment());
        paymentSystem.makePayment(1000);

        paymentSystem.setPaymentMethod(new PayPalPayment());
        paymentSystem.makePayment(1000);
    }
}
