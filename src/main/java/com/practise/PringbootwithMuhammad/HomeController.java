package com.practise.PringbootwithMuhammad;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @RequestMapping("/")
    public String getHomePage(Model model){

        model.addAttribute("var","Says hello to the world");
        return  "index";
    }




}
