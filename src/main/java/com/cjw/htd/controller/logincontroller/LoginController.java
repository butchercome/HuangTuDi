package com.cjw.htd.controller.logincontroller;

import com.cjw.htd.entity.login.UserInfo;
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
    @RequestMapping("/register")
    public String loginCheck(){
        boolean  is=false;
        is=true;
        return "index";
    }
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView createUser(UserInfo user){
        ModelAndView  mav=new ModelAndView();
        mav.addObject("user",user);
        mav.setViewName("/login");
        return mav;
    }
}
