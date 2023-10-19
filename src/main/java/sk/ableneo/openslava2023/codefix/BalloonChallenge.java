package sk.ableneo.openslava2023.codefix;

import sk.ableneo.openslava2023.donotfix.Order;
import sk.ableneo.openslava2023.donotfix.OrderRepository;
import sk.ableneo.openslava2023.donotfix.Product;

import java.util.ArrayList;
import java.util.LinkedList;

// TODO: fix the class
public class BalloonChallenge {

    public LinkedList findOrdersForProduct(Product p, boolean debug) {
        ArrayList checkedOrderList = new ArrayList();
        ArrayList allOrderslist = getAllOrders();
        for (Object o : allOrderslist) {
            Order order = (Order) o;
            boolean found = false;
            if (!order.getProducts().isEmpty()) {
                for (int j = 0; j < order.getProducts().size(); j++) {
                    Product p2 = order.getProducts().get(j);
                    found = (p2.equals(p));
                }
                if (found)
                    try {
                        checkedOrderList.add(order);
                    } catch (RuntimeException e) {
                        throw new RuntimeException("Can`t add order " + e);
                    }
            }
        }
        return new LinkedList(checkedOrderList);
    }

    public ArrayList getAllOrders() {
        return new ArrayList<Object>(OrderRepository.getAllOrders());
    }
}
