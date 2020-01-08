package com.example.controller;

import com.example.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;

@Controller
public class SecondThymeleafController {

    @GetMapping("/second")
    public String sendValue(Model m){
        String msg="Hello, Thymeleaf!";
        m.addAttribute("msg",msg);

        User user = new User();
        user.setId(1);
        user.setName("伊朗");
        user.setAge(57);
        m.addAttribute("user",user);

        HashMap<String, Object> src = new HashMap<>();
        src.put("img1","1.jpg");
        src.put("img2","2.jpg");
        m.addAttribute("src",src);

        return "index2";
    }

}
