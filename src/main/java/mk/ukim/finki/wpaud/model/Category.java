package mk.ukim.finki.wpaud.model;

import lombok.Data;

@Data
public class Category {
    private String name;
    private String description;

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
