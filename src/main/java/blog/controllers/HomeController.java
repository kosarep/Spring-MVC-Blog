package blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Grzegorz on 31.05.2017.
 */

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
