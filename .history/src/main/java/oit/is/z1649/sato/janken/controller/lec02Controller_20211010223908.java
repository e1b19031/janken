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
     * @return 
     */
    @PostMapping("/lec02")
    public String lec02(@RequestParam String username,ModelMap model) {
        model.addAttribute("name",username);
        return "lec02.html";
    }

    /**
     * hand
     * 0:グー 1:チョキ 2:パー
     * @param hand
     * @return
     */
    @GetMapping("/lec02janken")
    public String lec02_1(@RequestParam Integer hand,ModelMap model) {
        int cpu=0;
        int user = hand.intValue();

        switch (hand) {
            case 0:
                model.addAttribute("userHand","Gu");
                break;
            case 1:
                model.addAttribute("userHand","Tyoki");
                break;
            case 2:
                model.addAttribute("userHand","Pa");
                break;
        
            default:
                break;
        }
        
        switch (cpu) {
            case 0:
                model.addAttribute("userHand","Gu");
                break;
            case 1:
                model.addAttribute("userHand","Tyoki");
                break;
            case 2:
                model.addAttribute("userHand","Pa");
                break;
        
            default:
                break;
        }

        switch ((hand-cpu+3)%3) {
            case 0:
                model.addAttribute("result","You Draw!");
                break;
            case 1:
                model.addAttribute("result","You Win!");
                break;
            case 2:
                model.addAttribute("result","You Lose!");    
                break;
        }
        return "lec02.html";
    }
}