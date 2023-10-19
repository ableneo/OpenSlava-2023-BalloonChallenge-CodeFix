package sk.ableneo.openslava2023.codefix;

import sk.ableneo.openslava2023.donotfix.Order;
import sk.ableneo.openslava2023.donotfix.OrderRepository;
import sk.ableneo.openslava2023.donotfix.Product;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// TODO: fix the class
public class BalloonChallenge {

    public LinkedList findOrdersForProduct(Product p, boolean debug) {
        ArrayList results = new ArrayList();
        ArrayList allOrders = getAllOrders();

        for (int i = 0; i < allOrders.size(); i++) {
            Order order = (Order) allOrders.get(i);
            boolean found = order.getProducts().contains(p);

            if (found)
                results.add(order);
        }
        
        return new LinkedList(results);
    }

    public ArrayList getAllOrders() {
        return new ArrayList<Object>(OrderRepository.getAllOrders());
    }
}
