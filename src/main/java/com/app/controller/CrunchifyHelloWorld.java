package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
    public class CrunchifyHelloWorld {

        @RequestMapping("/welcome")
        public ModelAndView helloWorld() {

            String message = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
            return new ModelAndView("welcome", "message", message);
        }
    }

