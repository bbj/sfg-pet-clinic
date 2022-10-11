package com.bbj.sfgpetclinic.controllers;

import com.bbj.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/index", "/index.html"})
    public String listOwners(Model model) { //Spring MVC will inject the Model automatically when calling

        model.addAttribute(
                "owners",       //name of the property inside the model
                ownerService.findAll()      //calling the service to return owners
        );
        return "owners/index";              //return the index page templates/owners/index path
    }
}
