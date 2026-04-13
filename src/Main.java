public class Main {
  public static void main(String[] args) {
    Method selectedMethod = Method.PAYPAL;
    double total = 250.0;

    PaymentProcessor processor = PaymentFactory.createProcessor(selectedMethod);
    processor.process(total);
  }
}
