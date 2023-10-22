package adapter_pattern;

public class ClientPaymentAdapter implements ClientPaymentProcessor{

    LegacyPaymentGateway legacyPaymentGateway;

    public ClientPaymentAdapter(LegacyPaymentGateway legacyPaymentGateway) {
        this.legacyPaymentGateway = legacyPaymentGateway;
    }

    @Override
    public void processRequest() {
        this.legacyPaymentGateway.request();
    }
}
