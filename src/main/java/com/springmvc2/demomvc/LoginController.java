package com.springmvc2.demomvc;

// Controller layer for Login Page
// Using Model

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// A simple controller using
// spring web annotations
@Controller
public class LoginController {

    // returning the login jsp
    // for root of the webpage
    @GetMapping("/")
    public String home(){
        return "login.jsp";
    }

    // mapping the "/login" request
    // requestparam is used to get the value
    // from get request parameters
    @GetMapping("/login")
    public String loginActionUsingModel(
            @RequestParam("name") String name,
            @RequestParam("password") String pass, Model model
    ){

        // adding the attribute passed from request
        // to the model object
        model.addAttribute("userName", name);
        model.addAttribute("password", pass);

        // returning the view
        return "templates/result.jsp";
// added this line
       // update with brqnch 2
    }
}
