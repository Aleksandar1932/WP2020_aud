package mk.ukim.finki.wpaud.bootstrap;

import lombok.Singular;
import mk.ukim.finki.wpaud.model.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Category> categories = new ArrayList<>();
    public static List<Manufacturer> manufacturers = new ArrayList<>();
    public static List<Product> products = new ArrayList<>();
    public static List<ShoppingCart> shoppingCarts = new ArrayList<>();

    public static List<User> users = new ArrayList<>();

    @PostConstruct
    public void init() {
        categories.add(new Category("Software", "Category for software"));
        categories.add(new Category("Books", "Category for books"));

        users.add(new User("aleksandar1932", "ai", "Aleksandar", "Ivanovski"));
        users.add(new User("riste.stojanov", "rs", "Riste", "Stojanov"));

        Manufacturer manufacturer = new Manufacturer("Nike", "NY Broadway 11");
        manufacturers.add(manufacturer);
        Category category = new Category("Sport", "Sport Category");
        categories.add(category);
        products.add(new Product("Ball 1", 15.5, 7, category, manufacturer));
        products.add(new Product("Ball 2", 22.7, 7, category, manufacturer));
        products.add(new Product("Ball 3", 32.6, 7, category, manufacturer));
    }
}
