package adapter_pattern;

public class LegacyPaymentGateway {

    void request() {
        System.out.println(new StringBuilder().append("Handling payment request from ").append(this.getClass().getName()).toString());
    }

}
