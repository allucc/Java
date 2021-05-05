package win.icpc.tacocloud.controller.Entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @author lucy
 * @date 2021/4/11 19:06
 */
@Data
@RequiredArgsConstructor
public class IngredientEntity {
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
