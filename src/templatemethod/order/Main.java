package templatemethod.order;

public class Main {
    public static void main(String[] args) {
        Order homeOrder = new Order("ORD-001", "Nguyen An", 450_000);
        Order pickupOrder = new Order("ORD-002", "Tran Binh", 320_000);

        OrderProcessor homeDelivery = new HomeDeliveryOrderProcessor();
        OrderProcessor storePickup = new StorePickupOrderProcessor();

        System.out.println("=== TRUONG HOP 1: GIAO TAN NOI ===");
        ProcessingResult result1 = homeDelivery.processOrder(homeOrder);
        System.out.println("Ket qua: " + result1.getFulfillmentMethod()
                + ", phi = " + result1.getServiceFee()
                + ", tong = " + result1.getTotalAmount());

        System.out.println();
        System.out.println("=== TRUONG HOP 2: NHAN TAI CUA HANG ===");
        ProcessingResult result2 = storePickup.processOrder(pickupOrder);
        System.out.println("Ket qua: " + result2.getFulfillmentMethod()
                + ", phi = " + result2.getServiceFee()
                + ", tong = " + result2.getTotalAmount());
    }
}
