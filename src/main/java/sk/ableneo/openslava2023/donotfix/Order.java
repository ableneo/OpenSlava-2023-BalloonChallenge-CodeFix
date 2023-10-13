package sk.ableneo.openslava2023.donotfix;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Product> products = new ArrayList<>();

    public Order(List<Product> products) {
        this.products.addAll(products);
    }

    public List<Product> getProducts() {
        return products;
    }
}
