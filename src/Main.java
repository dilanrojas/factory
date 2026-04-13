public class Main {
  public static void main(String[] args) {
    PaypalFactory paypalFactory = new PaypalFactory();
    CreditCardFactory creditCardFactory = new CreditCardFactory();

    PaymentProcessor paymentPaypal = paypalFactory.processPayment();
    PaymentProcessor paymentCredit = creditCardFactory.processPayment();

    paymentPaypal.process(250.45);
    paymentCredit.process(300.45);
  }
}
