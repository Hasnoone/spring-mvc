package org.example.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@RestController
@RequestMapping("demo")
public class DemoController {

    @RequestMapping("getDate")
    public void test() {

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("date", new Date());

        modelAndView.setView("");




    }


}
