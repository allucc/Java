package win.icpc.tacocloud.service;

import win.icpc.tacocloud.controller.Entity.Ingredient;

/**
 * @author lucy
 * @date 2021/4/14 21:54
 */
public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save (Ingredient ingredient);
}

