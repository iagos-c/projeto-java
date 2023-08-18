package com.senai.segundoprojetoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/")
public class HomeController {

    @GetMapping
    public String index(Model model, HttpServletRequest request){
        model.addAttribute("nome", com.senai.projetowebsenai.service.CookieService.getCookie(request,"nome"));
        return "home/index";
    }



}
