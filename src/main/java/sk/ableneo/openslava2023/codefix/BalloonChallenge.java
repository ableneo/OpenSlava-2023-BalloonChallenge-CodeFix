package sk.ableneo.openslava2023.codefix;

import sk.ableneo.openslava2023.donotfix.Order;
import sk.ableneo.openslava2023.donotfix.OrderRepository;
import sk.ableneo.openslava2023.donotfix.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// TODO: fix the class
public class BalloonChallenge {

    public List<Order> findOrdersForProduct(Product p, boolean debug) {
        List<Order> l = new ArrayList();
        List<Order> list = getAllOrders();

        for (int i = 0; i < list.size(); i++) {
            Order order = list.get(i);
            boolean found = false;
            List<Product> products = order.getProducts();
            if (products.size() > 0) {
                for (int j = 0; j < order.getProducts().size(); j++) {
                    Product p2 = (Product) order.getProducts().get(j);
                    found = p2.equals(p);
                }
                if (found && order != null)
                    l.add(order);
            }
        }
        return l;
    }

    public List<Order> getAllOrders() {
        return new ArrayList<Order>(OrderRepository.getAllOrders());
    }
}
