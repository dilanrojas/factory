public class CreditCardProcessor implements PaymentProcessor {
  @Override
  public void process(double amount) {
    System.out.println("Processing amount: " + amount + " using credit card...");
  }
}
