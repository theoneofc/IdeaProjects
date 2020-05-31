package cn.edu.springboot.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${person.name}")
//    那我是.yml的怎么用@Value语法
    private String name;

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "Hello, " + name;
    }
}
