package templatemethod.order;

public final class StorePickupOrderProcessor extends OrderProcessor {

    @Override
    protected int calculateServiceFee(Order order) {
        int fee = 0;
        printServiceFee(fee);
        return fee;
    }

    @Override
    protected void fulfillOrder(Order order) {
        System.out.println("5. Dua don hang vao quay cho khach den nhan tai cua hang");
    }

    @Override
    protected String fulfillmentMethod() {
        return "STORE_PICKUP";
    }
}
