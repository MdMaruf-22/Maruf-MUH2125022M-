package Payment;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public boolean pay(double amount) {
        System.out.println("Paid via credit card for " + amount);
        return true;
    }
}
