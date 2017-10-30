package com.inzy.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	static{
		System.out.println("fffff");
	}
	@RequestMapping("/login")
    public String login() {
       // model.addAttribute("name", name);
        return "login";
    }
}
