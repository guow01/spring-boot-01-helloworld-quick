package com.highp.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/*")
public class HelloController {

//    @Autowired
//    private UserDao userDao;

    //index页面
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    //注册页面
    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    //登录页面
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    //注册方法
//    @RequestMapping("/addregister")
//    public String register(HttpServletRequest request){
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        String password2 = request.getParameter("password2");
//        if (password.equals(password2)){
//            UserEntity userEntity = new UserEntity();
//            userEntity.setUsername(username);
//            userEntity.setPassword(password);
//            userDao.save(userEntity);
//            return "login";
//        }else {
//            return "register";
//        }
//    }

    //登录方法
//    @RequestMapping("/addlogin")
//    public String login(HttpServletRequest request){
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        UserEntity userEntity = userDao.findByUsernameAndPassword(username,password);
//        String str = "";
//        if (userEntity !=null){
//            str = "index";
//        }else {
//            str = "login";
//        }
//        return str;
//    }
}
