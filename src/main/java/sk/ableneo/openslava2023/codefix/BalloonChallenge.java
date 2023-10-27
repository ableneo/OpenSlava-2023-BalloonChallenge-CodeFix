package sk.ableneo.openslava2023.codefix;

import sk.ableneo.openslava2023.donotfix.Order;
import sk.ableneo.openslava2023.donotfix.OrderRepository;
import sk.ableneo.openslava2023.donotfix.Product;

import java.util.ArrayList;
import java.util.LinkedList;

// TODO: fix the class
public class BalloonChallenge {

    public LinkedList findOrdersForProduct(Product p, boolean debug) {
        ArrayList l = new ArrayList();
        ArrayList list = getAllOrders();

        boolean found = false;
        for (Object o : list) {
            Order order = (Order) o;
            int sizeOrder = order.getProducts().size();
            if (!order.getProducts().isEmpty()) {
                for (int j = 0; j < sizeOrder; j++) {
                    Product p2 = (Product) order.getProducts().get(j);
                    found = (p2.equals(p));
                }
                if (found)
                    l.add(order);
            }
        }
        return new LinkedList(l);
    }

    public ArrayList getAllOrders() {
        return new ArrayList<Object>(OrderRepository.getAllOrders());
    }
}
