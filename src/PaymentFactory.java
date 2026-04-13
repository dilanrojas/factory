public class PaymentFactory {
  public static PaymentProcessor createProcessor(Method method) {
    switch (method) {
      case CREDIT_CARD:
        return new CreditCardProcessor();
      case PAYPAL:
        return new PaypalProcessor();
      default:
        throw new IllegalArgumentException("Método de pago no reconocido.");
    }
  }
}
