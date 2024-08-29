package bt.hangdoi;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Them 1 so san pham
        Product product1 = new Product("SP1", "Sản phẩm 1", 180);
        Product product2 = new Product("SP2", "Sản phẩm 2", 250);
        Product product3 = new Product("SP3", "Sản phẩm 3", 320);
        Product product4 = new Product("SP4", "Sản phẩm 4", 550);
        Product product5 = new Product("SP5", "Sản phẩm 5", 430);

        Cart cart1 = new Cart(1);
        cart1.getItems().add(new CartItem(product1, 10));
        cart1.getItems().add(new CartItem(product3, 2));

        Cart cart2 = new Cart(2);
        cart2.getItems().add(new CartItem(product4, 8));
        cart2.getItems().add(new CartItem(product5, 4));

        Cart cart3 = new Cart(3);
        cart3.getItems().add(new CartItem(product2, 8));
        cart3.getItems().add(new CartItem(product4, 4));

        // Them vao hang doi
        Queue queue = new Queue(100);
        queue.enqueue(cart3);
        queue.enqueue(cart1);
        queue.enqueue(cart2);

        while (!queue.isEmpty()) {
            Cart cart = queue.dequeue();
            // Thanh toan cart
            System.out.println("Thanh toán cho giỏ hàng: " + cart.getId());
            Thread.sleep(3000);
            cart.payment();

        }
    }
}
