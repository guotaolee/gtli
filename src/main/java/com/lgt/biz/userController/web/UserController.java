package com.lgt.biz.userController.web;

import com.lgt.dbaccess.user.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/toUser",method = RequestMethod.GET)
    public  String toUser(HttpServletRequest request){
        return "/login";
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public String addUser(HttpServletRequest request, User user){
        String result = "this is addUser-----------";
        request.setAttribute("userName",user.getUserName());
        return  "/addUser";
    }

    @RequestMapping(value = "/delUser",method = RequestMethod.POST)
    public String delUser(HttpServletRequest request){
        String result = "this is delUser-----------";
        request.setAttribute("result",result);
        return  "/annotation";
    }

    @RequestMapping(value = "/addUserJson",method = RequestMethod.POST)
    public String addUserJson(HttpServletRequest request, User user){
        String result = "this is addUser-----------";
        request.setAttribute("userName",user.getUserName());
        return  "/addUser";
    }
}
