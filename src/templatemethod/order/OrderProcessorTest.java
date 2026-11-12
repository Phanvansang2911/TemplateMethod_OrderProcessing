package templatemethod.order;

public class OrderProcessorTest {
    public static void main(String[] args) {
        testHomeDelivery();
        testStorePickup();
        System.out.println("ALL TESTS PASSED");
    }

    private static void testHomeDelivery() {
        Order order = new Order("T-001", "Test A", 100_000);
        ProcessingResult result = new HomeDeliveryOrderProcessor().processOrder(order);
        assertEquals("HOME_DELIVERY", result.getFulfillmentMethod(), "delivery method");
        assertEquals(30_000, result.getServiceFee(), "delivery fee");
        assertEquals(130_000, result.getTotalAmount(), "delivery total");
    }

    private static void testStorePickup() {
        Order order = new Order("T-002", "Test B", 100_000);
        ProcessingResult result = new StorePickupOrderProcessor().processOrder(order);
        assertEquals("STORE_PICKUP", result.getFulfillmentMethod(), "pickup method");
        assertEquals(0, result.getServiceFee(), "pickup fee");
        assertEquals(100_000, result.getTotalAmount(), "pickup total");
    }

    private static void assertEquals(Object expected, Object actual, String label) {
        if (!expected.equals(actual)) {
            throw new AssertionError(label + ": expected=" + expected + ", actual=" + actual);
        }
    }
}
