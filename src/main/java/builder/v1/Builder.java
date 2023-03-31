package builder.v1;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Builder {
    public static void main(String[] args) {
        PaymentDocument paymentDocument = PaymentDocument.builder()
                .docGuid(UUID.randomUUID())
                .sumAmount(BigDecimal.valueOf(200))
                .docDate(LocalDateTime.now())
                .payee("PAO Prazdnik")
                .payer("ZAO Otkritie")
                .build();

        System.out.println(paymentDocument);
    }
}

class PaymentDocument {
    private UUID docGuid;
    private BigDecimal sumAmount;
    private LocalDateTime docDate;
    private String payer;
    private String payee;

    public static Builder builder() {
        return new PaymentDocument.Builder();
    }

    private PaymentDocument(Builder builder) {
        this.docGuid = builder.docGuid;
        this.sumAmount = builder.sumAmount;
        this.docDate = builder.docDate;
        this.payer = builder.payer;
        this.payee = builder.payee;
    }

    public static class Builder {
        private UUID docGuid;
        private BigDecimal sumAmount;
        private LocalDateTime docDate;
        private String payer;
        private String payee;

        public Builder docGuid(UUID docGuid) {
            this.docGuid = docGuid;
            return this;
        }

        public Builder sumAmount(BigDecimal sumAmount) {
            this.sumAmount = sumAmount;
            return this;
        }

        public Builder docDate(LocalDateTime docDate) {
            this.docDate = docDate;
            return this;
        }

        public Builder payer(String payer) {
            this.payer = payer;
            return this;
        }

        public Builder payee(String payee) {
            this.payee = payee;
            return this;
        }

        public PaymentDocument build() {
            return new PaymentDocument(this);
        }
    }

    @Override
    public String toString() {
        return "creational.builder.v2.PaymentDocument2{" +
                "docGuid=" + docGuid +
                ", sumAmount=" + sumAmount +
                ", docDate=" + docDate +
                ", payer='" + payer + '\'' +
                ", payee='" + payee + '\'' +
                '}';
    }
}
