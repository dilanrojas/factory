public class PaypalFactory extends PaymentFactory {
  @Override
  public PaymentProcessor processPayment() {
    return new PaypalProcessor();
  }
}
