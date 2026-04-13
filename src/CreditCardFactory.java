public class CreditCardFactory extends PaymentFactory {
  @Override
  public PaymentProcessor processPayment() {
    return new CreditCardProcessor();
  }
}
