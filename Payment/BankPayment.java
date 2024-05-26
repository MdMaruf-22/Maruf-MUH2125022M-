package Payment;

public class BankPayment implements PaymentMethod{
    @Override
    public boolean pay(double amount){
        System.out.println("Paid via bank transfer of " + amount);
        return true;
    }
}
