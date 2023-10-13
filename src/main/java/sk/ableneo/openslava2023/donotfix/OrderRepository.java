package sk.ableneo.openslava2023.donotfix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderRepository {
    public static List<Order> getAllOrders() {
        return Arrays.asList(
                new Order(new ArrayList<>(Arrays.asList(new Product("hot air balloon")))),
                new Order(new ArrayList<>(Arrays.asList(new Product("gas balloon")))),
                new Order(new ArrayList<>(Arrays.asList(new Product("gas balloon"))))
        );
    }
}
