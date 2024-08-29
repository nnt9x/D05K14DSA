package bt.hangdoi;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int id;
    private List<CartItem> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public Cart(int id) {
        this.id = id;
        this.items = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }

    public void payment() {
        if (items.isEmpty()) {
            System.out.println("Giỏ hàng rỗng, không thực hiện thanh toán");
            return;
        }
        System.out.printf("%-10s %-20s %-20s %-20s %-20s\n", "SP", "Tên sản phẩm", "Số lượng", "Đơn giá", "Thành tiền");
        int totalAmount = 0;
        for (int i = 0; i < items.size(); i++) {
            CartItem cartItem = items.get(i);
            Product product = cartItem.getProduct();
            int quantity = cartItem.getQuantity();
            System.out.printf("%-10s %-20s %-20d %-20d %-20d\n", product.getId(), product.getName(), quantity, product.getPrice(), quantity * product.getPrice());
            totalAmount += quantity * product.getPrice();
        }
        System.out.println("Tổng tiền: " + totalAmount);
    }
}
