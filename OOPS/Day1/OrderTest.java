package OOPS.Day1;
class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    void getOrderStatus() {
        System.out.println("Order ID: " + orderId + ", Order Date: " + orderDate + ", Tracking: " + trackingNumber + ", Delivered on: " + deliveryDate);
    }
}

public class OrderTest {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder("ORD123", "2025-07-10", "TRK456", "2025-07-13");
        d.getOrderStatus();
    }
}

