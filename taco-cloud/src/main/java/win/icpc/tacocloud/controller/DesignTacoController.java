package win.icpc.tacocloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import win.icpc.tacocloud.controller.Entity.IngredientEntity;
import win.icpc.tacocloud.controller.Entity.IngredientEntity.Type;
import win.icpc.tacocloud.controller.Entity.TacoEntity;

import javax.servlet.http.PushBuilder;
import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * @author lucy
 * @date 2021/1/18 22:33
 */
@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {
    @GetMapping
    public String showDesignForm(Model model) {
        List<IngredientEntity> ingredients = Arrays.asList(
                new IngredientEntity("FLTO", "Flour Tortilla", Type.WRAP),
                new IngredientEntity("SRCR", "Sour Cream", Type.SAUCE)
        );
        Type[] types = IngredientEntity.Type.values();
        for (Type type : types) {
            model.addAttribute(type.toString().toLowerCase(Locale.ROOT),
                    filterByType(ingredients, type));
        }
        model.addAttribute("design", new TacoEntity());
        return "design";
    }

    /**
     * @description TODO
     *
     * @param design
     * @return java.lang.String
     */
    @PostMapping
    public String processDesign(@Valid TacoEntity design, Errors errors){
        if(errors.hasErrors()){
            return "design";
        }
        log.info("Processing design: " + design);
        return "redirect:/orders/current";
    }

    /**
     * @description TODO
     *
     * @param ingredients
     * @param type
     * @return java.util.List<win.icpc.tacocloud.controller.Entity.IngredientEntity>
     */
    private List<IngredientEntity> filterByType(List<IngredientEntity> ingredients, Type type) {
        return ingredients.stream().filter(x -> x.getType().equals(type))
                .collect(Collectors.toList());
    }
}
