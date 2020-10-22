package mk.ukim.finki.wpaud.bootstrap;

import lombok.Singular;
import mk.ukim.finki.wpaud.model.Category;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Category> categories = new ArrayList<>();

    @PostConstruct
    public void init() {
        categories.add(new Category("Software", "Category for software"));
        categories.add(new Category("Books", "Category for books"));
    }
}
