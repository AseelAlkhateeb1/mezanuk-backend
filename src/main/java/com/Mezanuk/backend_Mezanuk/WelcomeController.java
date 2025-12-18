package com.Mezanuk.backend_Mezanuk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
@GetMapping("/welcome")
public String welcome() {

    return  "Welcom Aseel to spring boot";
}
}
