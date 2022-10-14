package br.dev.paulovieira.tacocloud.util;

import br.dev.paulovieira.tacocloud.model.Ingredient;
import br.dev.paulovieira.tacocloud.repository.IngredientRepository;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class IngredientByCodeConverter implements Converter<String, Ingredient> {

    IngredientRepository ingredientRepository;

    public IngredientByCodeConverter(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Ingredient convert(String code) {
        var ingredient = ingredientRepository.findByCode(code);

        if (ingredient == null) {
            throw new IllegalArgumentException("Invalid ingredient code: " + code);
        }

        return ingredient;
    }

}