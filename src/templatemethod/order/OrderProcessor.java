package templatemethod.order;

public abstract class OrderProcessor {

    // Template Method: defines the fixed processing skeleton.
    public final ProcessingResult processOrder(Order order) {
        validateOrder(order);
        int serviceFee = calculateServiceFee(order);
        reserveInventory(order);
        prepareOrder(order);
        fulfillOrder(order);
        int totalAmount = order.getSubtotal() + serviceFee;
        sendConfirmation(order, totalAmount);
        return new ProcessingResult(order.getId(), fulfillmentMethod(), serviceFee, totalAmount);
    }

    // Common steps: reused unchanged by all subclasses.
    private void validateOrder(Order order) {
        if (order == null) {
            throw new IllegalArgumentException("Order must not be null");
        }
        System.out.println("1. Kiem tra don hang " + order.getId() + ": hop le");
    }

    private void reserveInventory(Order order) {
        System.out.println("3. Giu ton kho cho don hang " + order.getId());
    }

    private void prepareOrder(Order order) {
        System.out.println("4. Dong goi/chuan bi don hang cho " + order.getCustomerName());
    }

    private void sendConfirmation(Order order, int totalAmount) {
        System.out.println("6. Gui xac nhan cho khach hang; tong thanh toan = " + formatVnd(totalAmount));
    }

    // Variable steps: subclasses provide their own behavior.
    protected abstract int calculateServiceFee(Order order);

    protected abstract void fulfillOrder(Order order);

    protected abstract String fulfillmentMethod();

    protected final void printServiceFee(int fee) {
        System.out.println("2. Phi dich vu = " + formatVnd(fee));
    }

    protected final String formatVnd(int amount) {
        return String.format("%,d VND", amount);
    }
}
