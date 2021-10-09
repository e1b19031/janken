package oit.is.z1649.sato.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class lec02Controller{
    
    /**
     * 
     * @param param1
     * @param model
     * @return
     */

    @PostMapping("/lec02")
    public String username(@RequestParam String param1,ModelMap model) {
        model.addAttribute("username",name);
        return "lec02.html";
    }
}