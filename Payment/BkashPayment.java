package Payment;

public class BkashPayment implements PaymentMethod{
    @Override
    public boolean pay(double amount){
        System.out.println("Paid via Bkash: "+amount);
        return true;
    }
}
