package com.cloud.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    private HiService hiService;
    @RequestMapping("/hello")
    public String hello(){
        return hiService.helloService();
    }
}
