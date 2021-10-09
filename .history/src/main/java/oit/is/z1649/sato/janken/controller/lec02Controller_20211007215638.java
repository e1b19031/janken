package oit.is.z1649.sato.janken;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class lec02Controller{
    
    @PostMapping("/username")
    public String username() {
        
        return lec02.html;
    }
}