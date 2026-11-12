package templatemethod.order;

public final class Order {
    private final String id;
    private final String customerName;
    private final int subtotal;

    public Order(String id, String customerName, int subtotal) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Order id must not be blank");
        }
        if (customerName == null || customerName.isBlank()) {
            throw new IllegalArgumentException("Customer name must not be blank");
        }
        if (subtotal <= 0) {
            throw new IllegalArgumentException("Subtotal must be positive");
        }
        this.id = id;
        this.customerName = customerName;
        this.subtotal = subtotal;
    }

    public String getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getSubtotal() {
        return subtotal;
    }
}
