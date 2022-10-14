package br.dev.paulovieira.tacocloud.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tacos")
public class Taco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date createdAt;
    @NotNull
    @Size(min=5, message="Name must be at least 5 characters long")
    private String name;
    @Size(min=1, message="You must choose at least 1 ingredient")
    @ManyToMany(targetEntity = Ingredient.class)
    @JoinTable(name = "taco_ingredients",
            joinColumns = @JoinColumn(name = "taco_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id"))
    private List<Ingredient> ingredients = new ArrayList<>();

    public Taco() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Taco taco = (Taco) o;
        return getId().equals(taco.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
