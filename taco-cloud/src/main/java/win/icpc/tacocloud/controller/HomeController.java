package win.icpc.tacocloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author lucy
 * @date 2021/1/18 22:33
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }


}
