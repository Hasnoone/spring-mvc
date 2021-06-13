package org.example.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@RestController
@RequestMapping("demo")
public class DemoController {

    @RequestMapping(value = "getDate",method = RequestMethod.GET)
    public ModelAndView test() {

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("date", new Date());

        modelAndView.setViewName("/WEB-INF/jsp/success.jsp");

        return modelAndView;

    }


}
