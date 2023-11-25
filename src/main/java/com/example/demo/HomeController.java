package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// worked with rest controller not controller simplu, cred ca o sa
// reiau capitolele de la 1 incepand :)
@Controller            // <1>
public class HomeController {

  @GetMapping("/home")     // <2>
  public String home() {
    return "home";     // <3>
  }

}
