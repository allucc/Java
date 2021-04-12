package win.icpc.tacocloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import win.icpc.tacocloud.controller.Entity.OrderEntity;

import javax.validation.Valid;

/**
 * @author lucy
 * @date 2021/4/12 22:18
 */
@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {
    @GetMapping("/current")
    public String orderForm(Model model) {
        model.addAttribute("order", new OrderEntity());
        return "orderForm";
    }

    @PostMapping
    public String processOrder(@Valid OrderEntity order, Errors errors){
        if(errors.hasErrors()){
            return "orderForm";
        }
        log.info("Order submitted: " + order);
        return "redirect:/";
    }
}
