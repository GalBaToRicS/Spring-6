package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String getIndex1() {
        return "index";
    }

    @GetMapping("/index")
    public String getIndex2() {
        return "index";
    }
}