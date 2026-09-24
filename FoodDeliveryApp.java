public class FoodDeliveryApp {

    // Thread for placing the order
    static class OrderPlacement extends Thread {

        public void run() {
            System.out.println("Order placement started...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println("Food order placed successfully.");
        }
    }

    // Thread for delivering the order
    static class OrderDelivery extends Thread {

        public void run() {
            System.out.println("Order delivery started...");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println("Food delivered successfully.");
        }
    }

    public static void main(String[] args) {

        // Create two threads
        OrderPlacement order = new OrderPlacement();
        OrderDelivery delivery = new OrderDelivery();

        // Start order placement first
        order.start();

        // Wait until order placement is completed
        try {
            order.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Start delivery after order placement
        delivery.start();

        // Wait for delivery to finish
        try {
            delivery.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Food delivery process completed.");
    }
}
