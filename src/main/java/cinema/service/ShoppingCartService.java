package cinema.service;

import cinema.lib.model.MovieSession;
import cinema.lib.model.ShoppingCart;
import cinema.lib.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
