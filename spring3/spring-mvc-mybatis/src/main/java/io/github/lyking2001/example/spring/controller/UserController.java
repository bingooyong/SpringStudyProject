package io.github.lyking2001.example.spring.controller;

import io.github.lyking2001.example.spring.pojo.User;
import io.github.lyking2001.example.spring.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public String showUser(int id, HttpServletRequest request) {
        User u = userService.getUserById(id);
        request.setAttribute("user", u);
        return "showUser";
    }
}
