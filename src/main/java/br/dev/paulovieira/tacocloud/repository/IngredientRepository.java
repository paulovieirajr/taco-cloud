package br.dev.paulovieira.tacocloud.repository;

import br.dev.paulovieira.tacocloud.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {

    Ingredient findByCode(String code);
}

