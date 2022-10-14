package br.dev.paulovieira.tacocloud.config;

import br.dev.paulovieira.tacocloud.model.Ingredient;
import br.dev.paulovieira.tacocloud.model.enums.Type;
import br.dev.paulovieira.tacocloud.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader implements CommandLineRunner {

    IngredientRepository ingredientRepository;

    public DataLoader(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        ingredientRepository.save(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
//        ingredientRepository.save(new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
//        ingredientRepository.save(new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
//        ingredientRepository.save(new Ingredient("CARN", "Carnitas", Type.PROTEIN));
//        ingredientRepository.save(new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
//        ingredientRepository.save(new Ingredient("LETC", "Lettuce", Type.VEGGIES));
//        ingredientRepository.save(new Ingredient("CHED", "Cheddar", Type.CHEESE));
//        ingredientRepository.save(new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
//        ingredientRepository.save(new Ingredient("SLSA", "Salsa", Type.SAUCE));
//        ingredientRepository.save(new Ingredient("SRCR", "Sour Cream", Type.SAUCE));
    }
}
