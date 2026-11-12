package templatemethod.order;

public final class HomeDeliveryOrderProcessor extends OrderProcessor {
    private static final int DELIVERY_FEE = 30_000;

    @Override
    protected int calculateServiceFee(Order order) {
        printServiceFee(DELIVERY_FEE);
        return DELIVERY_FEE;
    }

    @Override
    protected void fulfillOrder(Order order) {
        System.out.println("5. Ban giao don hang cho don vi van chuyen giao tan noi");
    }

    @Override
    protected String fulfillmentMethod() {
        return "HOME_DELIVERY";
    }
}
