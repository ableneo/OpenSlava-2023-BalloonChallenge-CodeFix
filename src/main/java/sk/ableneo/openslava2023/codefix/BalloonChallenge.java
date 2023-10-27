package sk.ableneo.openslava2023.codefix;

import sk.ableneo.openslava2023.donotfix.Order;
import sk.ableneo.openslava2023.donotfix.OrderRepository;
import sk.ableneo.openslava2023.donotfix.Product;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// TODO: fix the class
public class BalloonChallenge {

    public List<Order> findOrdersForProduct(Product p, boolean debug) {
        List<Order> res = new ArrayList<>();
        List<Order> orders = getAllOrders();
        for_order: for (Order order : orders) {
            List<Product> ps =  order.getProducts();
            if (ps == null)
                continue;
            for (Product p2 : ps) {
                if (p2.equals(p)) {
                    res.add(order);
                    continue for_order;
                }
            }
        }
        return res;
    }

    public ArrayList getAllOrders() {
        return new ArrayList<Object>(OrderRepository.getAllOrders());
    }
}
