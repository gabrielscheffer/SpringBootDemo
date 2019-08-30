package br.com.gabrielscheffer.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloWorldController {
    @RequestMapping("/")
    @ResponseBody
    String hello(){
        String env = System.getenv("APP_ENV");
        return "Hello World! You are running in environment=" + (env == null?"local":env) ;
    }
}
