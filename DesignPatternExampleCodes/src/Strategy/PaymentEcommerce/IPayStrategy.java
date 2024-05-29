package Strategy.PaymentEcommerce;

public interface IPayStrategy {
    public boolean payment(int paymentAmount);
    public void collectPaymentdetails();
}
