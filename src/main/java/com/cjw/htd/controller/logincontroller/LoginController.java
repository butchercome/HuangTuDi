package com.cjw.htd.controller.logincontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2016/6/11.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping("/login")
    public String loginPage(){
        boolean  is=false;
        is=true;

        return "login";
    }
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView logincheck(){
        ModelAndView  mav=new ModelAndView();
        mav.addObject("login");
        return mav;
    }
}
