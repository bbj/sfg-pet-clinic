package com.bbj.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    //when user request all these URLs
    @RequestMapping({"", "/", "index", "index.html"})
    public String index() {
        return "index";
    }
}
