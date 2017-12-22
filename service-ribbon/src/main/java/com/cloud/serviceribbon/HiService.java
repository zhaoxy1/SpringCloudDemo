package com.cloud.serviceribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HiService {
    @Autowired
    private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "helloError")
    public String helloService(){
        return restTemplate.getForObject("http://SERVICE-HELLO/index",String.class);
    }

    public String helloError(){
        return "Error";
    }

}
