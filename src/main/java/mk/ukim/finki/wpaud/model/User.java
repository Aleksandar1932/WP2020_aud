package mk.ukim.finki.wpaud.model;

import lombok.Data;
import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "shop_users")
public class User {
    @Id
    private String username;

    private String password;

    private String name;

    private String surname;


    // se izbegnuva vo production
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER) // lazy-loading; reverse table of the attribute `user` in ShoppingCart
    private List<ShoppingCart> carts;

    public User(String username, String password, String name, String surname) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public User() {
    }
}
