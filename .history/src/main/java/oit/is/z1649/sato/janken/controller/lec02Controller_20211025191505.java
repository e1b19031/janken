package oit.is.z1649.sato.janken.controller;

import java.security.Principal;
import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oit.is.z1649.sato.janken.model.Entry;
import oit.is.z1649.sato.janken.model.User;
import oit.is.z1649.sato.janken.model.UserMapper;
import oit.is.z1649.sato.janken.model.Match;
import oit.is.z1649.sato.janken.model.MatchMapper;
@Controller
public class Lec02Controller{

    @Autowired
    private Entry entry;

    @Autowired
    UserMapper userMapper;

    @Autowired
    MatchMapper matchMapper;

    /**
   *
   * @param model Thymeleafにわたすデータを保持するオブジェクト
   * @param prin  ログインユーザ情報が保持されるオブジェクト
   * @return
   */
    @GetMapping("/lec02")
    public String lec02(Principal prin,ModelMap model){
        String loginuser=prin.getName();
        model.addAttribute("login_user",loginuser);
        this.entry.addUser(loginuser);
        model.addAttribute("entry", this.entry);
        ArrayList<User> user=userMapper.selectAll();
        model.addAttribute("users",user);
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
        model.addAttribute("userHand",stHand(user));
        model.addAttribute("cpuHand",stHand(cpu));

        switch ((user-cpu+3)%3) {
            case 0:
                model.addAttribute("result","You Draw!");
                break;
            case 1:
                model.addAttribute("result","You Lose!");    
                break;
            case 2:
                model.addAttribute("result","You Win!");
                break;
        }
        return "lec02.html";
    }

    public static String stHand(int inHand) {
        switch (inHand) {
            case 0:
                return "Gu";
            case 1:
                return "Tyoki";
            case 2:
                return "Pa";
        }
        return "";
    }

    public static void selectAllMatches(ModelMap model) {
        ArrayList<Match> matches=matchMapper.selectAll();
    }
}