package templatemethod.order;

public final class ProcessingResult {
    private final String orderId;
    private final String fulfillmentMethod;
    private final int serviceFee;
    private final int totalAmount;

    public ProcessingResult(String orderId, String fulfillmentMethod, int serviceFee, int totalAmount) {
        this.orderId = orderId;
        this.fulfillmentMethod = fulfillmentMethod;
        this.serviceFee = serviceFee;
        this.totalAmount = totalAmount;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getFulfillmentMethod() {
        return fulfillmentMethod;
    }

    public int getServiceFee() {
        return serviceFee;
    }

    public int getTotalAmount() {
        return totalAmount;
    }
}
