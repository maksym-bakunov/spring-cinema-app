package cinema.dao;

import cinema.lib.model.Order;
import cinema.lib.model.User;
import java.util.List;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
