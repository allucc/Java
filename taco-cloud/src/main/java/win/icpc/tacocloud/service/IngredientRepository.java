package win.icpc.tacocloud.service.impl;

import win.icpc.tacocloud.controller.Entity.IngredientEntity;

/**
 * @author lucy
 * @date 2021/4/14 21:54
 */
public interface IngredientRepository {
    Iterable<IngredientEntity> findAll();

}

