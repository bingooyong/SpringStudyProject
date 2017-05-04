package com.sishuok.controller;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sishuok.entity.User;

@Controller
@RequestMapping(value = "/user", method = RequestMethod.POST)
public class UserController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User view(@PathVariable("id") Long id, HttpServletRequest httpServletRequest) {
        User user = new User();
        user.setId(id);
        user.setName("zhang");

        // System.out.println("------");
        // StringBuffer jb = new StringBuffer();
        // String line = null;
        // try {
        // BufferedReader reader = httpServletRequest.getReader();
        // while ((line = reader.readLine()) != null)
        // jb.append(line);
        // } catch (Exception e) { /*report an error*/ }
        //
        // System.out.println(jb.toString());


        // Map<String, String> info = getHeadersInfo(httpServletRequest);
        //
        // for (Map.Entry<String, String> entry : info.entrySet()) {
        // System.out.println(entry.getKey() + ":" + entry);
        // }

        Map<String, String[]> map = httpServletRequest.getParameterMap();
        for (Map.Entry<String, String[]> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + Arrays.toString(entry.getValue()));
        }
        System.out.println("------");
        return user;
    }

    private Map<String, String> getHeadersInfo(HttpServletRequest request) {

        Map<String, String> map = new HashMap<String, String>();

        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            String value = request.getHeader(key);
            map.put(key, value);
        }

        return map;
    }
}
