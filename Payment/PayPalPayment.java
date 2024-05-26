package Payment;

public class PayPalPayment implements PaymentMethod{
    @Override
    public boolean pay(double amount){
        System.out.println("Paid via PayPal for " + amount);
        return true;
    }
}
