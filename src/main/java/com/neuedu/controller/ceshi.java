package com.neuedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ceshi
{
    @RequestMapping("/login")
    public String login()
    {
        return "login";
    }
}
