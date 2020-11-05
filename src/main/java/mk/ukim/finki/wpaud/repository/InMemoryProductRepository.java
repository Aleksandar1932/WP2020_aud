package mk.ukim.finki.wpaud.repository;

import mk.ukim.finki.wpaud.bootstrap.DataHolder;
import mk.ukim.finki.wpaud.model.Category;
import mk.ukim.finki.wpaud.model.Manufacturer;
import mk.ukim.finki.wpaud.model.Product;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryProductRepository {

    public List<Product> findAll() {
        return DataHolder.products;
    }

    public Optional<Product> findById(Long id) {
        return DataHolder.products
                .stream()
                .filter(product -> product.getId().equals(id))
                .findFirst();
    }

    public Optional<Product> findByName(String name) {
        return DataHolder.products
                .stream()
                .filter(product -> product.getName().equals(name))
                .findFirst();
    }

    public Optional<Product> save(String name, Double price, Integer quantity, Category category, Manufacturer manufacturer) {
        DataHolder.products.removeIf(product1 -> product1.getName().equals(name));

        Product product = new Product(name, price, quantity, category, manufacturer);
        DataHolder.products.add(product);

        return Optional.of(product);
    }

    public void deleteById(Long id) {
        DataHolder.products.removeIf(product -> product.getId().equals(id));
    }
}
