package uk.org.md.democi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    String index(){
        return "Hello there!!!";
    }
}
