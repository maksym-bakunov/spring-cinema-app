package cinema.service;

import cinema.lib.model.Order;
import cinema.lib.model.ShoppingCart;
import cinema.lib.model.User;
import java.util.List;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
