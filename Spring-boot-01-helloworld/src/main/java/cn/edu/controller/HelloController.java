package cn.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller

/* RestController：是spring4里的新注解，是@ResponseBody和@Controller的缩写。*/
@RestController
public class HelloController {

    // RestController：是spring4里的新注解，是@ResponseBody和@Controller的缩写。
    //@RequestBody //出错了，应该是已经被淘汰了 Error:(10, 5) java: 注释类型不适用于该类型的声明
//后来勘误，没有淘汰，只是两种写法，报错的原因是把@ResponseBody写成@RequestBody 了
    @RequestMapping("/hello")
    public String hello() {
        return "Hello,World!";
    }
}
