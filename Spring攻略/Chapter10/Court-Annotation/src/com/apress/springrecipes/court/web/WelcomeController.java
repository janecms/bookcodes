package com.apress.springrecipes.court.web;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/welcome.htm")
public class WelcomeController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView welcome() {
        Date today = new Date();
        return new ModelAndView("welcome", "today", today);
    }
}
