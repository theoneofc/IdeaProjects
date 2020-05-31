package cn.edu.springboot.controller;


//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController
@Controller
public class HelloCotroller {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello, World!";
    }

    @RequestMapping("/success")
    public String success(){
        return "success";
    }

}

