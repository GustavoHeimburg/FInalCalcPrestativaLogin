package com.calc.prestativa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CookiesController {

    @GetMapping("/cookies")
    public String showCookieBanner() {
        return "cookies";
    }

    @GetMapping("/accept-cookies")
    public String acceptCookies() {
        return "redirect:/";
    }
}
