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
        for (int i = 0; i < list.size(); i++) {
            Order order = (Order) list.get(i);
            boolean found = false;
            if (order.getProducts().size() > 0) {
                for (int j = 0; j <= order.getProducts().size(); j++) {
                    Product p2 = order.getProducts().get(j);
                    found = (p2.equals(p));
                }
                if (found && order != null)
                    l.add(order);
            }
        }
        return new LinkedList(l);
    }

    public ArrayList getAllOrders() {
        return new ArrayList<Object>(OrderRepository.getAllOrders());
    }
}
